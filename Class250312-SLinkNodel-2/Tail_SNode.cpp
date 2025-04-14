#include <stdio.h>
#include <stdlib.h>

typedef struct node{
	int data;
	struct node *next; 
}SLinkNode; 


//尾插法
void CLTail(SLinkNode *&L,int a[],int n){
	if(L==NULL){
		L = (SLinkNode *)malloc(sizeof(SLinkNode));
		L->next=NULL; 
	}
	
	//找尾结点 
	SLinkNode *tc=L;
	while(tc->next!=NULL){
		tc=tc->next;		
	}
	
	//在尾部插入元素 
	for(int i=0;i<n;i++){
		
		SLinkNode *s = (SLinkNode *)malloc(sizeof(SLinkNode));
		s->data=a[i];
		s->next=NULL;
		
		tc->next=s;//当前尾结点指向新结点s 
		tc=s; //tc指向新的尾结点 
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
	
	CLTail(L,a,n);
	
	printf("单链表："); 
	DispList(L);
	
	printf("\n");
	
	int b[]={7,8,9};
	int n1 = sizeof(b)/sizeof(b[0]);
	
	CLTail(L,b,n1);
	
	printf("单链表："); 
	DispList(L);

	
	Destroy(L);
	
}
