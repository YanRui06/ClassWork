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
	printf("当前j和p：");
	printf("j=%d ",j);
	printf("p=%p (前驱结点) ",(void *)p);
	printf("p->next=%p (p的后继结点)\n",(void *)p->next);
	
	printf("\n");
	
	//如果找到，创建新结点，完成插入 
	if(p!=NULL){	 	
		SLinkNode *s=(SLinkNode *)malloc(sizeof(SLinkNode));	
		s->data=e; 	
		
		//插入操作 
		s->next=p->next;	
		p->next=s;
		
		printf("新结点s:  ");
		printf("s=%p   ",(void *)s);	 //新结点地址 
		printf("s->data=%d\n",s->data); //新结点data
		
		printf("\n");
		
		printf("s 插入到 p 指向结点之后：\n");
		printf("s->next=%p (当前 p->next)   ",(void *)s->next); //新结点的后继结点地址 
		printf("p->next=%p (s)\n",(void *)p->next); //p的后继结点地址 		
		
		return 1;	
	}
	//没有找到，返回0 
	else{ 
		return 0; 
	}
}

//删除 i 位置 的元素 
int Delete(SLinkNode *&L,int i){
	//i无效，返回0 
	if(i<=0) return 0;
	 
	//p遍历，找第 i-1个结点
	SLinkNode *p=L; 
	int j = 0;
	while(p!=NULL&&j<i-1){
		j++;
		p=p->next;
	}
	
	//循环结束，输出 j、 p 
	printf("当前j和p：");
	printf("j=%d  ",j);
	printf("p=%p (前驱结点)  ",(void *)p);
	printf("p->next=%p (p的后继结点)\n",(void *)p->next);
	
	//如果找到，删除p结点的后面的结点 
	if(p!=NULL){	 			
		
		//删除操作 
		SLinkNode *q=p->next; //q指向要删除的结点 
		if(q==NULL) return 0; //这条语句的重要性 
		
		//执行删除	
		p->next=q->next;		
		free(q);
		
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
	if(Insert(L,100,1)){
		printf("插入成功！ ");
		printf("输出单链表：");DispList(L);
		printf("\n");
	}
	else{
		printf("插入失败！\n");	
	}
	printf("\n");
	
	printf("在位置2插入元素200\n");
	if(Insert(L,200,2)){
		printf("插入成功！ ");
		printf("输出单链表：");DispList(L);
		printf("\n");
	}
	else{
		printf("插入失败！\n");	
	}
	
	printf("\n");

	printf("删除位置3的元素\n");
	if(Delete(L,3)){
		printf("删除成功！  ");
		printf("输出单链表：");
		DispList(L);
	}
	else{
		printf("删除失败！\n");
		printf("\n");	
	}
	
	printf("删除位置2的元素\n");
	if(Delete(L,2)){
		printf("删除成功！  ");
		printf("输出单链表：");
		DispList(L);
	}
	else{
		printf("删除失败！\n");
		printf("\n");	
	}
	
	Destroy(L); 
			
}
