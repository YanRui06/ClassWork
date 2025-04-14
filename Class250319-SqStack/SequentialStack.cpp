#include"stdio.h"

#define MaxSize 10

typedef char Elemtype;

typedef struct{
	Elemtype data[MaxSize];
	int top;
}SqStack;

void InitStack(SqStack *st){
	st->top = -1;

}

void DestoryStack(SqStack *st){

}

int Push(SqStack *st,Elemtype x){
	if(st->top==MaxSize-1){
		return 0;
	}else{
		st->top++;
		st->data[st->top] = x;
		return 1;
	}
}

int Pop(SqStack *st,Elemtype x){
	if(st->top == -1){
		return 0;
	}else{
		x = st->data[st->top];
		return 1;
	}
}

int StackEmpty(SqStack *st)
{
	if(st->top == -1){
		return 1;
	}
	else return 0;
	
}
Elemtype GetTop(SqStack *st){
	if(st->top == -1){
		printf("栈空\n");
		return 0;
	}
	return st->data[st->top];
}

int main(){
	Elemtype a,b,c;
	Elemtype x;
	SqStack st;
	InitStack(&st);
	printf("栈的地址:%p\n",&st);
	if(!StackEmpty(&st)){
		printf("栈不空\n");
	}else{
		printf("栈空\n");
	}
	Push(&st,a);
	printf("栈顶元素:a\n");
	if(!StackEmpty(&st)){
		printf("栈不空\n");
	}else{
		printf("栈空\n");
	}
	x= GetTop(&st);
	printf("栈顶指针：%d\n",x);

}