#include <stdio.h>
#include <string.h>

#define MAX_VERTICES 4
#define NAME_LENGTH 20

// 打印图的邻接矩阵和好友名称
void printGraph(char names[MAX_VERTICES][NAME_LENGTH], int adjMatrix[MAX_VERTICES][MAX_VERTICES], int V) {
    printf("Friendship Graph (Adjacency Matrix):\n");
    
    // 打印列标题（好友名称）
    printf("    ");
    for (int i = 0; i < V; i++) {
        printf("%-8s", names[i]);
    }
    printf("\n");

    // 打印邻接矩阵
    for (int i = 0; i < V; i++) {
        printf("%-8s", names[i]); // 打印行标题（好友名称）
        for (int j = 0; j < V; j++) {
            printf("%-8d", adjMatrix[i][j]);
        }
        printf("\n");
    }
}

int main() {
    // 好友名称
    char names[MAX_VERTICES][NAME_LENGTH] = {"小王", "小李", "小红", "小江"};
    
    // 初始化邻接矩阵
    int adjMatrix[MAX_VERTICES][MAX_VERTICES] = {0};
    
    // 添加好友关系（示例）
    // 小王和小李是好友
    adjMatrix[0][1] = 1;
    adjMatrix[1][0] = 1; // 无向图，所以对称位置也设为1
    
    // 小李和小红是好友
    adjMatrix[1][2] = 1;
    adjMatrix[2][1] = 1;
    
    // 小红和小江是好友
    adjMatrix[2][3] = 1;
    adjMatrix[3][2] = 1;
    
    // 打印图的邻接矩阵和好友名称
    printGraph(names, adjMatrix, MAX_VERTICES);
    
    return 0;
}