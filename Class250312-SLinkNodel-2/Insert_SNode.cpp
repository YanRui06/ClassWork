#include<stdio.h>
#include<stdlib.h>

typedef struct node{
	int data;
	struct node *next;
}SLinkNode; 

//创建带头结点的空单链表 
void Inist(SLinkNode *&L){
	L = (SLinkNode *)malloc(sizeof(SLinkNode));
	L->next=NULL;
}

//输出 
void DispList(SLinkNode *L){
	SLinkNode *p=L->next;
	while(p!=NULL){
		printf("%d ",p->data);
		p = p->next;
	}
}

//销毁
void Destroy(SLinkNode *&L){
	SLinkNode *p=L;
	while(p!=NULL){
		SLinkNode *temp = p;
		p=p->next;
		free(temp);
	}
	L=NULL;	
}

//i位置插入元素 
int Insert(SLinkNode *&L,int e,int i){
	//i无效，返回0 
	if(i<=0) return 0;
	 
	//p遍历，找第 i-1个结点 (计数器j、指针p)，在p指向结点的后面插入	 
	SLinkNode *p=L;  //p初始指向头结点 ,在头结点后面插入 
	int j = 0;
	while(p!=NULL&&j<i-1){
		j++;
		p=p->next;
	}
	
	//循环结束，输出 j、 p 
	printf("p指向前驱结点位置：\n");
	printf("j=%d\n",j);
	printf("p=%p (前驱结点)\n",(void *)p);
	printf("p->next=%p (p的后继结点)\n",(void *)p->next);
	
	printf("\n");
	
	//如果找到，创建新结点，完成插入 
	if(p!=NULL){	 	
		SLinkNode *s=(SLinkNode *)malloc(sizeof(SLinkNode));	
		s->data=e; 	
		
		//插入操作 
		s->next=p->next;	
		p->next=s;
		
		printf("新结点s:\n");
		printf("s=%p\n",(void *)s);	 //新结点地址 
		printf("s->data=%d\n",s->data); //新结点data
		
		printf("\n");
		
		printf("s插入到p指向结点之后：\n");
		printf("s->next=%p (当前 p->next)\n",(void *)s->next); //新结点的后继结点地址 
		printf("p->next=%p (s)\n",(void *)p->next); //p的后继结点地址 
		printf("\n");
		
		printf("\n");
		
		return 1;	
	}
	//没有找到，返回0 
	else{ 
		return 0; 
	}
}

int main(){
	SLinkNode *L=NULL;
	
	Inist(L);
	
	printf("头结点地址：%p\n",(void *)L);
	
	printf("\n");
	
	printf("在位置1插入元素100\n");
	printf("\n");
	if(Insert(L,100,1)){
		printf("插入成功！\n");
		printf("========================================\n");
	}
	else{
		printf("插入失败！\n");	
	}
	
	printf("在位置2插入元素200\n");
	printf("\n");
	if(Insert(L,200,2)){
		printf("插入成功！\n");
		printf("\n");
	}
	else{
		printf("插入失败！\n");	
	}
	return 0;	
	
	Destroy(L);	
}
