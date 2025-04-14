#include"SqStack.cpp"

int main() {
	SqStack st;
	ElemType data[] = {1, 2, 2, 1, 2, 3};
	int len = sizeof(data) / sizeof(ElemType);
	int temp = 2;

	//初始化栈
	printf("初始化栈st\n");
	InitStack(st);

	//元素进栈
	PushArrayToStack(st, data, len);

	//删除元素
	printf("删除所有元素%d\n", temp);
	DeleteElement(st, temp);

	//打印栈
	printStack(st);

	//销毁栈
	printf("销毁栈\n");
	DestroyStack(st);
}