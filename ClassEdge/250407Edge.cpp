#include <stdio.h>
 
#define NUM_VERTICES 5
typedef char ElemType;
 
typedef struct {
    ElemType vexs[NUM_VERTICES];
    int edges[NUM_VERTICES][NUM_VERTICES];
} MatGraph;
 
void addEdge(MatGraph *g, int u, int v) {
    g->edges[u][v] = 1;
    g->edges[v][u] = 1;  // 因为是无向图，所以对称
}
 
void displayGraph(MatGraph *g) {
    printf("Adjacency Matrix:\n");
    for (int i = 0; i < NUM_VERTICES; i++) {
        printf("%c ", g->vexs[i]);  // 显示顶点字符
        for (int j = 0; j < NUM_VERTICES; j++) {
            printf("%d ", g->edges[i][j]);
        }
        printf("\n");
    }
}
 
int main() {
    // 假设 a=0, b=1, c=2, d=3, e=4
    MatGraph g = {{'a', 'b', 'c', 'd', 'e'}, {0}};
 
    // 初始化邻接矩阵为0
    for (int i = 0; i < NUM_VERTICES; i++) {
        for (int j = 0; j < NUM_VERTICES; j++) {
            if (i != j) {
                g.edges[i][j] = 0;
            }
        }
    }
 
    // 添加边
    addEdge(&g, 0, 1);  // a-b
    addEdge(&g, 0, 2);  // a-c
    addEdge(&g, 1, 2);  // b-c
    addEdge(&g, 1, 3);  // b-d
    addEdge(&g, 2, 4);  // c-e
 
    // 显示图
    displayGraph(&g);
 
    return 0;
}