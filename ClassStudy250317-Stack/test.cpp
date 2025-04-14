#include "stack.cpp"

int main() {
    SqStack st;
    ElemType e = 10;

    printf("初始化栈st\n");
    InitStack(st); // 修改为传递栈的地址
    if (st.top == -1) { // 直接检查栈顶指针来判断初始化是否成功（这里假设-1表示成功初始化）
        printf("栈初始化成功\n");
    } else {
        printf("栈初始化失败\n");
        return 1;
    }

    printf("将%d入栈\n", e);
    if (Push(st, e)) { // 修改为传递栈的地址
        printf("入栈成功\n");
    } else {
        printf("栈满，入栈失败\n");
    }

    if (!StackEmpty(st)) { // StackEmpty现在接受一个值传递的栈，因为它不修改栈
        printf("栈非空\n");
    } else {
        printf("栈为空\n");
    }

    if (!StackEmpty(st)) {
        if (Pop(st, e)) {
            printf("出栈元素为: %d\n", e);
        } else {
            // 实际上，如果StackEmpty检查显示栈不为空，Pop不应该失败（除非有并发修改或错误）
            // 但为了完整性，这里还是包含了失败的处理
            printf("出栈失败（理论上不应该发生）\n");
        }
    } else {
        printf("栈为空，无法出栈\n");
    }
 

    return 0;
}