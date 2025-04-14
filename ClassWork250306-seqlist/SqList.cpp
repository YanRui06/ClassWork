// SqList.cpp
#include "SqList.h"
#include <stdexcept>

// 初始化
void InitList(SqList& L) {
    L.length = 0;
}

// 销毁（无动态内存可省略）
void DestroyList(SqList L) {}

// 获取长度
int GetLength(SqList L) {
    return L.length;
}

// 获取元素
int GetElem(SqList L, int i, ElemType& e) {
    if (i < 1 || i > L.length) return 0;
    e = L.data[i - 1];
    return 1;
}

// 查找元素位置
int Locate(SqList L, ElemType x) {
    int i = 0;
    while (i < L.length && L.data[i] != x) i++;
    return (i < L.length) ? (i + 1) : 0;
}

// 插入元素
int InsElem(SqList& L, ElemType x, int i) {
    if (i < 1 || i > L.length + 1 || L.length == MaxSize) return 0;
    for (int j = L.length; j >= i; j--) {
        L.data[j] = L.data[j - 1];
    }
    L.data[i - 1] = x;
    L.length++;
    return 1;
}

// 删除元素（关键逻辑修正）
int DelElem(SqList& L, int i) {
    if (i < 1 || i > L.length) return 0;
    for (int j = i; j < L.length; j++) {
        L.data[j - 1] = L.data[j];  // 修正为 j-1
    }
    L.length--;
    return 1;
}

// 输出列表
void DispList(SqList L) {
    for (int i = 0; i < L.length; i++) {
        printf("%d ", L.data[i]);  // 添加空格分隔
    }
    printf("\n");
}
// 创建列表
// 将数组 a 中的元素复制到顺序表 L 中，并设置 L 的长度为 n
// 如果 n 超过了最大容量 MaxSize，则抛出无效参数异常
void CreateList(SqList& L, ElemType a[], int n) {
    if (n > MaxSize) {
        throw std::invalid_argument("Array size exceeds maximum list size.");
    }
    for (int i = 0; i < n; i++) {
        L.data[i] = a[i];
    }
    L.length = n;
}

// 显示列表
// 输出顺序表 L 中的所有元素，以空格分隔
void DispList(const SqList& L) {
    for (int i = 0; i < L.length; i++) {
        printf("%d ", L.data[i]);
    }
    printf("\n");
}