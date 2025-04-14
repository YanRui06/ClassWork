#include <stdio.h>
#include <stdlib.h>
typedef int ElemType;

typedef struct node {
	ElemType data;
	struct node *next;
} Node;

//初始化
Node* initList() {
	Node *head = (Node*)malloc(sizeof(Node));
	head->data = 0;
	head->next = NULL;
	return head;
}
//插入数据(头插法)
int insertHead(Node* L, ElemType e) {
	Node *p = (Node*)malloc(sizeof(Node));
	p->data = e;
	p->next = L->next;
	L->next = p;
	return 1;
}
//尾插法
Node* get_tail(Node *L) {
	Node *p = L;
	while (p->next != NULL) {
		p = p->next;
	}
	return p;
}
Node* insertTail(Node *tail, ElemType e) {
	Node *p = (Node*)malloc(sizeof(Node));
	p->data = e;
	tail->next = p;
	p -> next = NULL;
	return p;
}
//指定位置插入
int insertNode(Node *L, int pos, ElemType e) {
	//用来保存插入位置的前驱节点
	Node *p = L;
	int i = 0;
	//遍历链表找到插入位置的前驱节点
	while (i < pos - 1) {
		p = p->next;
		i++;
		if (p == NULL) {
			return 0;
		}
	}
	//要插入的新节点
	Node *q = (Node*)malloc(sizeof(Node));
	q->data = e;
	q->next = p->next;
	p->next = q;
	return 1;
}

//遍历
void listNode(Node* L) {
	Node *p = L->next;
	while (p != NULL) {
		printf("%d ", p->data);
		p = p->next;
	}
	printf("\n");
}
//删除节点
int deleteNode(Node *L, int pos) {
	//要删除节点的前驱
	Node *p = L;
	int i = 0;
	//遍历链表，找到要删除节点的前驱
	while (i < pos - 1) {
		p = p->next;
		i++;
		if (p == NULL) {
			return 0;
		}
	}
	if (p->next == NULL) {
		printf("要删除的位置错误\n");
		return 0;
	}
	//q指向要删除的节点
	Node *q = p->next;
	//让要删除节点的前驱指向要删除节点的后继
	p->next = q->next;
	//释放要删除节点的内存空间
	free(q);
	return 1;
}
//获取链表长度
int listLength(Node*L) {
	Node *p = L;
	int len = 0;
	while (p != NULL) {
		p = p->next;
		len++;
	}
	return len;
}
//释放链表
void freeList(Node *L) {
	Node*p = L->next;
	Node *q;
	while (p != NULL) {
		q = p;
		p = p->next;
		free(q);
	}
	L->next = NULL;
}
void insertSortDesc(Node **head) {
    if (*head == NULL || (*head)->next == NULL) return;

    // 1. 拆分链表
    Node *sorted = *head; // 已排序部分（初始为哨兵节点）
    Node *p = sorted->next; // 未排序部分
    sorted->next = NULL; // 断开已排序和未排序部分

    while (p != NULL) {
        // 保存下一个节点
        Node *q = p->next;

        // 从头开始寻找插入位置（降序：找到第一个比 p->data 小的节点）
        Node *pre = sorted; // 从哨兵节点开始
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

int main(int argc, char const*argv[]) {
	int len = 0;
	int end = 0;
	Node *list = initList();
	insertHead(list, 10);
	insertHead(list, 20);
	insertHead(list, 30);
	listNode(list);
	insertNode(list, 2, 15);
	listNode(list);
	deleteNode(list, 2);
	len = listLength(list);
	printf("%d\n", len);
	freeList(list);
	end = listLength(list);
	printf("%d\n", end);
	/*insertSortDesc(&list);
	printf("%d\n", len);*/
	return 0;
}