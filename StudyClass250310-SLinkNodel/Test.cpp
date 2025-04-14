#include"SLinkNodel.cpp"

int main() {
    // 测试代码
    SLinkNode* list = NULL;
    InitList(list);
    InsertTail(list, 1);
    InsertTail(list, 2);
    InsertTail(list, 3);
    TraverseList(list);
    DestroyList(list);
    return 0;
}