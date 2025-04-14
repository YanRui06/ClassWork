#include <stdio.h>
#include <stdlib.h>

typedef int ElemType;

typedef struct SLinkNode {
    ElemType data;
    struct SLinkNode* next;
} SLinkNode;

// 初始化链表
void InitList(SLinkNode*& L) {
    L = (SLinkNode*)malloc(sizeof(SLinkNode));
    if (L == NULL) {
        printf("分配内存地址失败\n");
        exit(1);
    }
    L->next = NULL;
}

// 在链表尾部插入新节点
void InsertTail(SLinkNode* L, ElemType e) {
    SLinkNode* p = L;
    while (p->next != NULL) {
        p = p->next;
    }
    SLinkNode* newNode = (SLinkNode*)malloc(sizeof(SLinkNode));
    newNode->data = e;
    newNode->next = NULL;
    p->next = newNode;
}

// 其余函数保持原样...

// 打印链表所有元素
void TraverseList(SLinkNode* L) {
    SLinkNode* p = L->next;
    while (p) {
        printf("%d -> ", p->data);
        p = p->next;
    }
    printf("NULL\n");
}

// 销毁整个链表（包括头节点）
void DestroyList(SLinkNode*& L) {
    SLinkNode* p = L;
    while (L) {
        p = L;
        L = L->next;
        free(p);
    }
    L = NULL;
}
