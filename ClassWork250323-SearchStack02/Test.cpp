#include"LinkStack.cpp"

int main() {
	char exp[] = "{[()]}";
	int n = sizeof(exp) / sizeof(exp[0]) - 1; // 去掉末尾的空字符
	if (Match(exp, n)) {
		printf("括号匹配\n");
	} else {
		printf("括号不匹配\n");
	}
	return 0;
}