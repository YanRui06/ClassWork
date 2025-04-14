#include "SqStack.cpp"

int main() {
    SqStack st;
    ElemType e[] = {6, 5, 4, 3, 2, 1};
    int len = sizeof(e);
    int k = 5;

    printf("初始化栈st\n");
    InitStack(st); // 修改为传递栈的地址

    if (st.top == -1) { // 直接检查栈顶指针来判断初始化是否成功（这里假设-1表示成功初始化）
        printf("栈初始化成功\n");
    } else {
        printf("栈初始化失败\n");
        return 1;
    }

    printf("将");
    for (int i; i < len; i++) {
        printf("%d ", e[i]);
    }
    printf("入栈\n");
    PushArrayToStack(st, e, len);

    if (!StackEmpty(st)) { // StackEmpty现在接受一个值传递的栈，因为它不修改栈
        printf("栈非空\n");
    } else {
        printf("栈为空\n");
    }

    printf("输入位置%d\n", k);
    int result = Search(st, k);
    printf(("第%d位置的元素是:%d\n"), k, result);

    DestroyStack(st);
    printf("销毁栈\n");
    return 0;
}