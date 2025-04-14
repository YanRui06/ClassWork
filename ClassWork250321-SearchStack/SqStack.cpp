#include <stdio.h>

typedef char ElemType;			//假设顺序栈中所有元素为char类型

// 顺序栈的结构体类型
#define MaxSize 100				//顺序栈的初始分配空间大小
typedef struct
{	ElemType data[MaxSize];		//保存栈中元素
	int top;					//栈顶指针
} SqStack;

//初始化
void InitStack(SqStack &st)		//st为引用型参数
{
	st.top = -1;
}
//销毁
void DestroyStack(SqStack st)
{    }

//进栈
int Push(SqStack &st, ElemType x)
{	if (st.top == MaxSize - 1)	//栈满
		return 0;
	else
	{	st.top++;
		st.data[st.top] = x;
		return 1;
	}
}
//数组进栈
void PushArrayToStack(SqStack &st, ElemType arr[], int arr_len) {
	for (int i = 0; i < arr_len; i++) {
		if (!Push(st, arr[i])) {
			printf("第 %d 个元素入栈失败，已终止\n", i);
			break;
		} else {
			printf("元素 %d 已入栈\n", arr[i]);
		}
	}
}
//出栈
int Pop(SqStack &st, int &x)	//x为引用型参数
{	if (st.top == -1)					//栈空
		return 0;
	else
	{	x = st.data[st.top];
		st.top--;
		return 1;
	}
}

//取栈顶元素
int GetTop(SqStack st, ElemType &x)	//x为引用型参数
{	if (st.top == -1)					//栈空
		return 0;
	else
	{	x = st.data[st.top];
		return 1;
	}
}
//判断栈空
int StackEmpty(SqStack st)
{	if (st.top == -1) return 1;
	else return 0;
}

int Search(SqStack st, ElemType x) {
	for (int i = 0; i <= st.top; i++) {  // 遍历有效元素
		if (st.data[i] == x)
			return st.data[i];  // 返回元素的索引位置
	}
	return -1;  // 未找到
}

// 判断栈是否为空
int isEmpty(SqStack st) {
	return st.top == -1;
}

//弹栈
int PopStack(SqStack st) {
	if (isEmpty(st))
	{
		printf("栈为空，无法弹出元素\n");
		return -1; // 返回错误标识
	}
	return st.data[st.top--];
}
//删除指定元素


int  DeleteElement(SqStack &st, ElemType x) {
	int found = 0;
	int newSize = 0;
	ElemType temp[MaxSize]; // 临时数组用于重新排列栈元素

	for (int i = 0; i <= st.top; i++) {
		if (st.data[i] != x) {
			temp[newSize++] = st.data[i];
		} else {
			found = 1;
		}
	}

	if (found) {
		for (int i = 0; i < newSize; i++) {
			st.data[i] = temp[i];
		}
		st.top = newSize - 1;
	}

	return found;
}
//打印栈元素

void printStack(SqStack st) {
	if (StackEmpty(st)) {
		printf("栈为空\n");
		return;
	}
	printf("栈元素(栈顶到栈底):");
	for (int i = st.top; i >= 0; i--) {
		printf("%d ", st.data[i]);
	}
	printf("\n");
}