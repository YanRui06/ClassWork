#include "SqList.h"
#include <stdexcept> // for std::invalid_argument
#include <cstdio>    // for printf

void Max(const SqList& L, ElemType& e) {
    if (L.length == 0) {
        throw std::invalid_argument("The list is empty.");
    }

    ElemType max = L.data[0];

    for (int i = 1; i < L.length; i++) {
        if (L.data[i] > max) {
            max = L.data[i];
        }
    }
    e = max;
}

void Min(const SqList& L, ElemType& e) {
    if (L.length == 0) {
        throw std::invalid_argument("The list is empty.");
    }

    ElemType min = L.data[0];

    for (int i = 1; i < L.length; i++) {
        if (L.data[i] < min) {
            min = L.data[i];
        }
    }
    e = min;
}

int main() {
    SqList L;

    ElemType a[] = { 2, 5, 3, 6, 8 };
    int n = sizeof(a) / sizeof(a[0]);

    // (1) 基于数组 a 创建顺序表 L，并输出
    CreateList(L, a, n);
    printf("线性表：");
    DispList(L);

    // (2) 找出最大值元素
    ElemType maxVal;
    Max(L, maxVal);
    printf("最大值：%d\n", maxVal);

    // (3) 找出最小值元素
    ElemType minVal;
    Min(L, minVal);
    printf("最小值：%d\n", minVal);

    // (4) 删除第2个元素开始的3个元素
    bool success = true;
    for (int i = 0; i < 3; i++) {
        if (!DelElem(L, 2)) {
            success = false;
            break;
        }
    }

    if (success) {
        printf("删除第2个元素开始的3个元素后，线性表：");
        DispList(L);
    }
    else {
        printf("删除元素失败。\n");
    }

    return 0;
}
