#include <stdio.h>

// 将10，30，20用顺序栈存储
#define MaxSize 100

typedef char Elemtype;
// 定义顺序栈的结构体类型
typedef struct
{
	Elemtype data[MaxSize];
	int top;
}SqStack;

void InitStack(SqStack &st)
{
	st.top = -1;
}

void DestoryStack(SqStack st){

}

int Push(SqStack &st,Elemtype x){
	if(st.top == MaxSize-1){
		return 0;
	}else{
		st.top++;
		st.data[st.top] = x;
		return 1;
	}
}

int Pop(SqStack &st,Elemtype x){
	if(st.top == -1){
		return 0;
	}
	else{
		x = st.data[st.top];
		return 1;
	}
}

int StackEmpty(SqStack &st){
	if(st.top ==-1 )
		return 1;
	else return 0;
}