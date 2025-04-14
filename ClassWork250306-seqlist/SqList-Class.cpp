#include <stdio.h>

#define MaxSize 100

typedef int ElemType;			//假设顺序表中所有元素为int类型

typedef struct
{	ElemType data[MaxSize];		//存放顺序表的元素
	int length;					//顺序表的实际长度
} SqList;						//顺序表类型

//初始化 
void InitList(SqList &L)	//由于L要回传给值参，所以用引用类型
{
	L.length=0;
}

//销毁 
void DestroyList(SqList L)
{
}

//求长度 
int GetLength(SqList L)
{
	return L.length;
}

//求第i个元素 
int GetElem(SqList L,int i,ElemType &e)
{	if (i<1 || i>L.length)		//无效的i值
		return 0;
	else
	{	e=L.data[i-1];  //逻辑序号i对应的数组下标是i-1 
		return 1;
	}
}

//按值查找(找第一个元素) ，返回其逻辑序号
int Locate(SqList L,ElemType x)	
{	int i=0;
	while (i<L.length && L.data[i]!=x)
		i++; 	//查找值为x的第1个元素,查找范围为0～L.length-1
	if (i>=L.length) return(0);	//未找到返回0
	else return(i+1);			//找到后返回其逻辑序号
}

//在i位置，插入一个元素 
int InsElem(SqList &L,ElemType x,int i)
{	int j;
	if (i<1 || i>L.length+1 || L.length==MaxSize)		//无效的参数i
		return 0;
	for (j=L.length;j>=i;j--)		//将位置为i的结点及之后的结点后移
		L.data[j]=L.data[j-1];
	L.data[i-1]=x;					//在位置i处放入x
	L.length++;						//线性表长度增1
	return 1;
}

//删除一个元素 
int DelElem(SqList &L,int i)
{	int j;
	if (i<1 || i>L.length)			//无效的参数i
		return 0;
	for (j=i;j<L.length;j++)		//将位置为i的结点之后的结点前移
		L.data[j-1]=L.data[j];
	L.length--;						//线性表长度减1
	return 1;
}

//输出全部元素 
void DispList(SqList L)
{	int i;
	for (i=0;i<L.length;i++)
		printf("%d ",L.data[i]);
	printf("\n");
}

//创建线性表 
void CreateList(SqList &L,ElemType a[],int n)
{
	int i,k=0;						//k累计顺序表L中的元素个数
	for (i=0;i<n;i++)
	{
		L.data[k]=a[i];				//向L中添加一个元素
		k++;						//L中元素个数增1
	}
	L.length=k;						//设置L的长度
}
