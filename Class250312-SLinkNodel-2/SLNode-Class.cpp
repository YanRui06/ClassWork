#include <stdlib.h>
#include <stdio.h>

typedef int ElemType;

typedef struct node
{  
	ElemType data;		//数据域
	struct node *next;	//指针域
} SLinkNode;			//单链表结点类型

//初始化单链表
void InitList(SLinkNode *&L) //L作为引用型参数
{
	//创建头结点
	L=(SLinkNode *)malloc(sizeof(SLinkNode));
	
	if (L == NULL) {  
		printf("内存分配失败!\n");  
        exit(1); // 退出程序  
    } 
	
	//头结点的指针域置为空 	
	L->next=NULL;
}

//销毁单链表 
void DestroyList(SLinkNode *&L)
{
	// 如果链表为空，直接返回
	if (L == NULL) {
        return; 
    }
    
    //两个指针 
    SLinkNode *pre = L, *p = pre->next;
    
    //释放每个结点 
    while (p != NULL) {
        free(pre);    // 释放pre节点
        pre = p;      // pre 指向下一个节点
        p = p->next;  // p 指向下一个节点
    }

    free(pre); // 释放最后一个节点
    L = NULL;  // 将链表头指针置为 NULL，避免悬空指针
}

void DestroyList01(SLinkNode *&L){
	SLinkNode *p=L;
	while(p!=NULL){
		SLinkNode *temp = p;
		p=p->next;
		free(temp);
	}
	L = NULL; 
}

//求单链表的长度（头结点不计入） 
int GetLength(SLinkNode *L){
	
	//p初始指向首结点 
	SLinkNode *p=L->next; 
	
	//遍历链表，i计数  
	int i=0; 
	while(p!=NULL){  //当前结点不为空 
		i++;
		p=p->next;
	}
	
	//返回i 
	return i;
} 

//输出单链表
void DispList(SLinkNode *L)
{
	//p指向首结点 	
	SLinkNode *p=L->next;
	
	//遍历链表，输出data，p后移 
	while(p!=NULL){
		printf("%d ",p->data);
		p=p->next;
	}	
	
	printf("\n");
} 

// 插入结点（1 ≤i ≤n+1） 
int InsElem(SLinkNode *&L,ElemType x,int i){
	
	//i无效，返回0 
	if(i<=0) return 0;
	 
	//找第 i-1个结点 (计数器j、指针p)
	SLinkNode *p=L;  //p初始指向头结点
	int j = 0;
	while(p!=NULL&&j<i-1){
		j++;
		p=p->next;
	}
	
	//循环结束，输出 j、 p 
	printf("当前j和p:\n");
	printf("j=%d\n",j);
	printf("p=%p\n",(void *)p);
	printf("p->next=%p\n",(void *)p->next);
	printf("\n");
	
	//如果找到，创建新结点，在p所指结点的后面插入	 
	if(p!=NULL){	 	
		SLinkNode *s=(SLinkNode *)malloc(sizeof(SLinkNode));	
		s->data=x; 	
		s->next=p->next;	
		p->next=s;
		
		printf("新结点s:\n");
		printf("s=%p\n",(void *)s);	 //新结点地址 
		printf("s->data=%d\n",s->data); //新结点的data
		printf("s->next=%p\n",(void *)s->next); //新结点的后继结点地址 
		printf("p->next=%p\n",(void *)p->next); //p的后继结点地址 
		printf("\n");
		
		return 1;	
	}
	//没有找到，返回0 
	else{ 
		return 0; 
	}
}

// 删除结点（1 ≤i≤n） 
int DelElem(SLinkNode *&L,int i){
	
	//i无效，返回0 
	if(i<=0) return 0;
	 
	//找第 i-1个结点(计数器j、指针p)
	SLinkNode *p=L;  //p初始指向头结点 
	int j = 0;
	while(p!=NULL&&j<i-1){
		j++;
		p=p->next;
	}
	
	//循环结束，输出 j、 p 
	printf("当前j和p:\n");
	printf("j=%d\n",j);
	printf("p=%p\n",(void *)p);
	printf("p->next=%p\n",(void *)p->next);
	printf("\n");
	
	//如果找到，删除节点
	if(p!=NULL){ 
		
		
		SLinkNode *q=p->next; //q保存p的后继结点
		
		if (q==NULL)	//没有第 i个结点，返回0
			return 0;
					
		else{
			printf("删除结点：");
			printf("q=%p\n",(void *)q);
			
			printf("删除结点的后继结点：");
			printf("q->next=%p\n",(void *)q->next);
			
			//执行删除 
			p->next=q->next;
			free(q);
			
			printf("删除之后：");
			printf("p->next=%p\n",(void *)p->next);
			
			return 1;
		} 		
	}
	//没有找到 ，返回0 
	else{ 
		return 0; 
	}
}

//求第 i个元素（1 ≤i≤n） 
int GetElem(SLinkNode *L,int i,ElemType &e)
{
	//参数i错误返回0 	
	if (i<=0) return 0;	 
	
	// 找第 i 个节点
	SLinkNode *p=L->next;		
	int j=1; 
	while (p!=NULL && j<i) 
	{	
		j++;
		p=p->next;
	}
	
	if (p!=NULL){
		e=p->data;
		return 1;	//找到后返回1
	}			
	else
	{
		return 0; //未找到返回0
	}
}

//查找元素，返回位置 i 
int Locate(SLinkNode *L,ElemType e)	
{	
	SLinkNode *p=L->next;	//p指向首结点
	
	int j=1; //j计数，查找位置 
	while (p!=NULL && p->data!=e)
	{	
		p=p->next;
		j++;
	}	
	if (p!=NULL){
		return j;	//找到后返回序号j 
	}			
	else
	{
		return 0; //未找到返回0
	}
}

//头插法建表
void CreateListF(SLinkNode *&L,ElemType a[],int n)
{
	//创建空单链表		
	L=(SLinkNode *)malloc(sizeof(SLinkNode));		
	L->next=NULL;			
	
	//遍历a数组所有元素
	for (int i=0;i<n;i++)	
	{
		//创建存放a[i]元素的新结点*s	
		SLinkNode *s=(SLinkNode *)malloc(sizeof(SLinkNode));
		s->data=a[i];		
		
		//将*s插在头结点之后		
		s->next=L->next;  //设置s的next域
		L->next=s;  //修改头结点的next域 
	}
}

//头插法 
void CreateListFF(SLinkNode *&L,ElemType a[],int n)
{
	if(L==NULL){
		InitList(L); //创建空链表 
	}
	
	//遍历数组，创建新结点，完成插入操作
	for(int i=0;i<n;i++){
		//创建新结点s 
		SLinkNode *s = (SLinkNode *)malloc(sizeof(SLinkNode));
		s->data=a[i];
		
		//将*s插在头结点之后	
		s->next=L->next; 
		L->next=s;	
	} 	
}

//尾插法建表
void CreateListR(SLinkNode *&L,ElemType a[],int n)
{	
	L=(SLinkNode *)malloc(sizeof(SLinkNode));	//创建头结点
	
	SLinkNode *tc=L;		//tc始终指向尾结点,开始时指向头结点
	for (int i=0;i<n;i++)
	{	
		SLinkNode *s=(SLinkNode *)malloc(sizeof(SLinkNode));	
		s->data=a[i];	
		s->next=NULL;
		//将*s插入*tc之后
		tc->next=s;				
		tc=s;
	}
}

//尾插法 
void CreateListRR(SLinkNode *&L,ElemType a[],int n){
	
	if(L==NULL){
		InitList(L);
	}		
	//找尾结点 
	SLinkNode *tc=L; 
	while(tc->next!=NULL){
		tc = tc->next;
	} 
	//遍历数组，创建新结点，完成插入操作
	for(int i=0;i<n;i++){
		SLinkNode *s = (SLinkNode *)malloc(sizeof(SLinkNode));
		s->data=a[i];
		s->next = NULL; 
		tc->next=s;
		tc=s;	
	} 	
}
