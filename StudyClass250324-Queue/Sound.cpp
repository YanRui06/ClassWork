#include <stdio.h>
#include <string.h>
#include <windows.h>

// 顺序队实现排队叫号 (循环队列)

#define MaxSize 100				//顺序队的初始分配空间大小
typedef struct
{	
	char data[MaxSize][10];		//保存队中元素
	int front,rear;				//队头和队尾指针
}SqQueue;

//初始化 
void InitQueue(SqQueue &sq)		//sq为引用型参数
{
	sq.rear=sq.front=0;			//指针初始化
}

// 进队 （rear进 1 ） 
int EnQueue(SqQueue &sq,char x[])
{	
	if ((sq.rear+1) % MaxSize==sq.front)	//队满上溢出
		return 0;
	sq.rear=(sq.rear+1) % MaxSize;			//队尾循环进1
	strcpy(sq.data[sq.rear],x);             // 将字符串x插入到队尾 
	return 1;
}

// 出队 （front进 1 ） 
int DeQueue(SqQueue &sq,char x[])		//x为引用型参数
{	
	if (sq.rear==sq.front)					//队空下溢出
		return 0;
	sq.front=(sq.front+1) % MaxSize;		//队头循环进1
	strcpy(x,sq.data[sq.front]);            //将队头元素 
	return 1;
}

// 判断队空 
int QueueEmpty(SqQueue sq)
{	if (sq.rear==sq.front) return 1;
	else return 0;
}

// 输出队列元素
int DispQueue(SqQueue sq){
	if(sq.front==sq.rear){
		return 0;
	}
	int i = (sq.front + 1) % MaxSize; // 队头元素位置  
    while (i != (sq.rear + 1) % MaxSize) { // 遍历队列  
        printf("%s ", sq.data[i]); // 输出当前元素  
        i = (i + 1) % MaxSize; // 移动到下一个元素位置  
    }  
    printf("\n"); // 换行  
    return 1; // 返回1表示成功 	
}

// 销毁 
void DestroyQueue(SqQueue sq)
{    }

// 语音播报 
void Speak(char x[]) {  
    char cmd[512];  
    // 构造完整的 PowerShell 命令，并注意转义  
    sprintf(cmd, "PowerShell -Command \""  
        "Add-Type -AssemblyName System.Speech; "  
        "$synth = New-Object System.Speech.Synthesis.SpeechSynthesizer; "  
        "$synth.Speak('请%s到101室就诊！');\"", x);  
    // 执行命令  
    system(cmd);  
} 

int main(){
	//创建队列 
	SqQueue sq;
	InitQueue(sq);
	
	char name[10];
	
	int sel,flag=1;
	while(flag==1){
		printf("1:排队 2:看医生 3:查看排队 0:下班  请选择:");
		if (scanf("%d", &sel) != 1)   
		{   
    		printf("输入无效，请输入数字！\n");  
    		while (getchar() != '\n');  // 清除输入缓冲区  
    		continue;  // 重新提示用户输入  
		} 
		switch(sel) 
		{
			case 0:				//医生下班
				printf("  >>医生下班！\n");
				if (!QueueEmpty(sq)){
					printf("  >>请排队的患者明天就医！\n");
					Speak("排队患者明天");
				}		
				DestroyQueue(sq);
				flag=0;
				break;
			case 1:				//排队
				printf("  >>输入患者姓名:");
				scanf("%s",name);
				EnQueue(sq,name);  	//入队 
				break;
			case 2:				//看医生
				if (!DeQueue(sq,name))   //出队 
					printf("  >>没有排队的患者！\n");
				else{
					printf("  >>请 %s 到101室就诊！\n",name);
				    Speak(name);
				}					
				break;
			case 3:				//查看目前病人排队情况
				printf("  >>排队患者:");
				if (!DispQueue(sq))
					printf("  >>没有排队的患者！\n");
				break;
			default:
                printf("无效的选择，请重新输入！\n");
                break;	
		}	
	}	
}
