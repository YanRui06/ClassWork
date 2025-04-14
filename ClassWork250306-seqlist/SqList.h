// SqList.h
#pragma once  // 防止重复包含
#include <stdio.h>

#define MaxSize 100
typedef int ElemType;

typedef struct {
    ElemType data[MaxSize];  // 已修正拼写
    int length;
} SqList;

// 函数声明
void InitList(SqList& L);
void DestroyList(SqList L);
int GetLength(SqList L);
int GetElem(SqList L, int i, ElemType& e);
int Locate(SqList L, ElemType x);
int InsElem(SqList& L, ElemType x, int i);
int DelElem(SqList& L, int i);
void DispList(SqList L);
void CreateList(SqList& L, ElemType a[], int n);
