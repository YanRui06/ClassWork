#include<stdio.h>

#define MaxSize 100

typedef int ElemType;  // 假设 ElemType 为 int 类型

typedef struct{
	ElemType data[MaxSize];
	int top;
}SqStack;
//初始化
void InitStack(SqStack &st){
	st.top = -1;
}
//销毁
void DestroyStack(SqStack st){

}
//进栈
int Push(SqStack &st,ElemType x){
	if(st.top==MaxSize-1)
		return 0;
	else{
		st.top++;
		st.data[st.top]=x;
		return 1;
	}
}
//出栈
int Pop(SqStack &st,ElemType &x){
	if(st.top==-1)
		return 0;
	else{
		x=st.data[st.top];
		return 1;
	}
}
//取栈顶
int GoTop(SqStack st,ElemType &x){
	if(st.top == -1)
		return 0;
	else{
		x = st.data[st.top];
		return 1;
	}
}
//判断栈空
int StackEmpty(SqStack st){
	if(st.top==-1)
		return 1;
	else return 0;
}