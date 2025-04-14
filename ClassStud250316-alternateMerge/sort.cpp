#include <stdio.h>
#include <stdlib.h>

// 定义链表节点结构
typedef struct ListNode {
    int data;
    struct ListNode *next;
} ListNode;

// 创建新节点
ListNode* createNode(int data) {
    ListNode *newNode = (ListNode*)malloc(sizeof(ListNode));
    if (newNode == NULL) {
        printf("内存分配失败\n");
        exit(1);
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// 打印链表
void printList(ListNode *head) {
    if (head == NULL) {
        printf("链表为空\n");
        return;
    }
    ListNode *current = head;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

// 插入排序实现降序排列
void insertSortDesc(ListNode **head) {
    if (*head == NULL || (*head)->next == NULL) return;

    // 1. 拆分链表
    ListNode *sorted = *head; // 已排序部分（初始为哨兵节点）
    ListNode *p = sorted->next; // 未排序部分
    sorted->next = NULL; // 断开已排序和未排序部分

    while (p != NULL) {
        // 保存下一个节点
        ListNode *q = p->next;

        // 从头开始寻找插入位置（降序：找到第一个比 p->data 小的节点）
        ListNode *pre = sorted; // 从哨兵节点开始
        while (pre->next != NULL && pre->next->data > p->data) {
            pre = pre->next;
        }

        // 插入节点到 pre 之后
        p->next = pre->next;
        pre->next = p;

        // 移动指针到下一个待处理节点
        p = q;
    }

    // 更新头指针（跳过哨兵节点）
    *head = sorted;
}

int main() {
    // 创建示例链表 2->1->5->6->7（带哨兵节点）
    ListNode *L = createNode(0); // 创建头结点（哨兵节点，值无意义）
    L->next = createNode(2);
    L->next->next = createNode(1);
    L->next->next->next = createNode(5);
    L->next->next->next->next = createNode(6);
    L->next->next->next->next->next = createNode(7);

    printf("原链表: ");
    printList(L->next); // 跳过哨兵节点打印

    // 执行排序
    insertSortDesc(&L);

    printf("降序排列结果: ");
    printList(L->next); // 跳过哨兵节点打印

    // 释放内存（实际开发中需要完整遍历释放）
    while (L != NULL) {
        ListNode *temp = L;
        L = L->next;
        free(temp);
    }

    return 0;
}