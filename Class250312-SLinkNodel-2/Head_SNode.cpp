#include <stdio.h>
#include <stdlib.h>

typedef struct node{
	int data;
	struct node *next; 
}SLinkNode; 

//头插法 
void CLHead(SLinkNode *&L,int a[],int n){
	if(L==NULL){
		L = (SLinkNode *)malloc(sizeof(SLinkNode));
		L->next=NULL; 
	}
	for(int i=0;i<n;i++){
		//创建新结点 
		SLinkNode *s = (SLinkNode *)malloc(sizeof(SLinkNode));
		s->data=a[i];
		
		//将新结点插入到头结点之后 
		s->next=L->next;  //s指向首结点 （s的后继结点设置为头结点的后继结点） 
		L->next=s; //头结点指向s （头结点的后继结点设置为s） 
	}
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

int main(){
	int a[]={1,2,3,4,5};
	int n = sizeof(a)/sizeof(a[0]);
	
	SLinkNode *L=NULL; 
	
	CLHead(L,a,n);
	
	printf("单链表："); 
	DispList(L);
	printf("\n");
	
	int b[]={7,8,9};
	int n1 = sizeof(b)/sizeof(b[0]);
	
	CLHead(L,b,n1);
	
	printf("单链表："); 
	DispList(L);
	
	Destroy(L);
	
}
