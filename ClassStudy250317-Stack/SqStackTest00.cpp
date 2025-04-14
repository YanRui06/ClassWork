#include<stdio.h>

#define MaxSize 100

typedef int ElemType;  // 假设 ElemType 为 int 类型

typedef struct {
	ElemType data[MaxSize];
	int top;
} SqStack;
//初始化
void InitStack(SqStack &st) {
	st.top = -1;
}
//销毁
void DestroyStack(SqStack st) {

}
//进栈
int Push(SqStack &st, ElemType x) {
	if (st.top == MaxSize - 1)
		return 0;
	else {
		st.top++;
		st.data[st.top] = x;
		return 1;
	}
}
//出栈
int Pop(SqStack &st, ElemType &x) {
	if (st.top == -1)
		return 0;
	else {
		x = st.data[st.top];
		return 1;
	}
}
//取栈顶
int GoTop(SqStack st, ElemType &x) {
	if (st.top == -1)
		return 0;
	else {
		x = st.data[st.top];
		return 1;
	}
}
//判断栈空
int StackEmpty(SqStack st) {
	if (st.top == -1)
		return 1;
	else return 0;
}


int main() {
	SqStack st;
	ElemType a = 10, b = 20, c = 30;
	//初始化，创建一个空栈
	InitStack(st);
	printf("栈的地址：%p\n", &st);

	// 10 进栈
	printf("10进栈\n");
	Push(st, a);

	// 30进栈
	printf("30进栈\n");
	Push(st, c);
	//20进栈
	printf("20进栈\n");
	Push(st, b);

	//取栈顶元素 ，输出
	printf("取出栈顶元素 20\n");


	//20出栈 ，输出20
	Pop(st, b);

	//判断栈空
	if (!StackEmpty(st)) {
		printf("栈不空\n");
	}
	else {
		printf("栈空\n");
	}

	//30出栈， 输出30
	printf("取出栈顶元素 30\n");
	Pop(st, c);

	//判断栈空
	if (!StackEmpty(st)) {
		printf("栈不空\n");
	}
	else {
		printf("栈空\n");
	}

	//10出栈， 输出10
	Pop(st, c);


	//销毁，系统自动释放空间
	if (!StackEmpty(st)) {
		printf("栈不空\n");
	}
	else {
		printf("栈空\n");
	}

}
