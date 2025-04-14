#include <stdio.h>
#include <stdlib.h>

// 定义链表节点结构
typedef struct ListNode {
    int val;
    struct ListNode *next;
} ListNode;

// 创建新节点（关键函数，确保原链表指针不被修改）
ListNode* createNode(int val) {
    ListNode* newNode = (ListNode*)malloc(sizeof(ListNode));
    newNode->val = val;
    newNode->next = NULL;
    return newNode;
}

// 交替合并函数
ListNode* alternateMerge(ListNode* l1, ListNode* l2) {
    // 创建哑节点作为合并后的链表头[3,9](@ref)
    ListNode dummy;
    ListNode* tail = &dummy;
    dummy.next = NULL;

    while (l1 && l2) {
        // 复制l1节点
        tail->next = createNode(l1->val);
        tail = tail->next;
        
        // 复制l2节点
        tail->next = createNode(l2->val);
        tail = tail->next;
        
        // 移动原链表指针（不修改原链表结构）
        l1 = l1->next;
        l2 = l2->next;
    }

    // 处理剩余节点[5,7](@ref)
    while (l1) {
        tail->next = createNode(l1->val);
        tail = tail->next;
        l1 = l1->next;
    }
    while (l2) {
        tail->next = createNode(l2->val);
        tail = tail->next;
        l2 = l2->next;
    }

    return dummy.next;
}

// 辅助函数：打印链表
void printList(ListNode* head) {
    while (head) {
        printf("%d -> ", head->val);
        head = head->next;
    }
    printf("NULL\n");
}

// 测试用例
int main() {
    // 创建链表1: 1->3->5
    ListNode* l1 = createNode(1);
    l1->next = createNode(3);
    l1->next->next = createNode(5);

    // 创建链表2: 2->4->6->8
    ListNode* l2 = createNode(2);
    l2->next = createNode(4);
    l2->next->next = createNode(6);
    l2->next->next->next = createNode(8);

    printf("原始链表1: ");
    printList(l1);
    printf("原始链表2: ");
    printList(l2);

    ListNode* merged = alternateMerge(l1, l2);
    printf("合并后链表: ");
    printList(merged);

    // 内存释放（实际使用需完善）
    while (merged) {
        ListNode* temp = merged;
        merged = merged->next;
        free(temp);
    }

    return 0;
}