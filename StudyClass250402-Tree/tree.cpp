#include <stdio.h>
#include <stdlib.h>

typedef char ElemType;

//二叉树结点类型 
typedef struct tnode
{    
    ElemType data;                     //数据域
    struct tnode *lchild,*rchild;    //指针域
} BTNode;

// 创建结点
BTNode* CreateNode(ElemType x){
    BTNode *p = (BTNode *)malloc(sizeof(BTNode));
    if(p==NULL){
        printf("内存分配失败\n");
        exit(1);
    }
    p->data=x;
    p->lchild=NULL;
    p->rchild=NULL;
    return p;    
}

int main(){
    BTNode *bt,*p;
    
    bt=CreateNode('A');
    
    p=CreateNode('B');
    
    bt->lchild=p;
    
    p=CreateNode('C');
    
    bt->rchild=p;
    
    
    
     
}