#include <stdio.h>
#include "SLNode-Class.cpp"


//小于5的元素
int Find(SLinkNode *L){
	SLinkNode *p=L->next;
	
	int i=0;
	
//	while(p!=NULL&&p->data<5){
//		i++;
//		p=p->next;
//	}
	while(p!=NULL){
		if(p->data<5){
			i++;
			printf("%d ", p->data); // 打印元素 			 
		}
		p=p->next;
	}
	return i;
}

//小于某个值的元素 
int Find01(SLinkNode *L,int data){
	
	SLinkNode *p=L->next;
	
	int i=0;

	while(p!=NULL){
		if(p->data<data){
			i++;
			printf("%d ", p->data); // 打印元素  
		} 
		p=p->next;
	}
	return i;
}

void Del(SLinkNode *&L){	
	SLinkNode *pre=L;
	SLinkNode *p=L->next;
	while(p!=NULL){
		if(p->data==1){
			pre->next=p->next;
			free(p);
			p=pre->next;
		}
		else{
			pre=p;
			p=p->next;
		}
	}	
}


int main(){
	SLinkNode *L=NULL;
	
	InitList(L);
	
	int a[]={1,2,3,6,1};
	int n = sizeof(a)/sizeof(a[0]);
	
	for(int i=0;i<n;i++) {
		InsElem(L,a[i],i+1);
	}
	printf("输出单链表: "); 
	DispList(L);
	
	int count;
	
	printf("小于5的元素: "); 
	count = Find(L);
	
	printf("\n");
	printf("个数: %d\n",count);
	
//	int data; 
//	printf("请输入一个整数: ");  
//    scanf("%d", &data); 
//	
//	count=Find01(L,data);
//	printf("小于%d的元素个数： %d",data,count);

	Del(L);
	printf("输出单链表: "); 	
	DispList(L);
	
	DestroyList(L);
	
}
