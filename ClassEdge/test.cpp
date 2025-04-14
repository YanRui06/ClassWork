#include <stdio.h>
#include <string.h>

// 邻接矩阵 (无向图)
#define MAXVEX 100     // 图中最大顶点个数
#define INF 32767      // 表示 ∞

// 顶点类型 VType
typedef struct {
    int adjvex;         // 顶点编号 
    char data[10];      // 顶点信息 (字符串)
} VType;

// 邻接矩阵类型 MatGraph
typedef struct {
    int n, e;                     // 实际顶点数、边数   
    VType vexs[MAXVEX];            // 顶点集合
    int edges[MAXVEX][MAXVEX];     // 边的集合
} MatGraph;

// 添加顶点信息
int AddVex(MatGraph &g, int i, char str[]) {
    if (i < 0 || i >= MAXVEX) {
        printf("顶点编号错误！\n");
        return -1;
    }
    strcpy(g.vexs[i].data, str);
    return 1;
}

// 输出顶点信息
void DispVexInfo(MatGraph g) {
    for (int i = 0; i < g.n; i++) {
        printf("[%d] %s\n", g.vexs[i].adjvex, g.vexs[i].data);
    }
}

// 建立邻接矩阵
void CreateGraph(MatGraph &g, int A[][MAXVEX], int n, int e) {
    g.n = n;
    g.e = e;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            g.edges[i][j] = A[i][j];
        }
    }
}

// 输出邻接矩阵
void DispGraph(MatGraph g) {
    for (int i = 0; i < g.n; i++) {
        for (int j = 0; j < g.n; j++) {
            if (g.edges[i][j] < INF)  // 输出权值或 INF
                printf("%4d", g.edges[i][j]);
            else
                printf("%4s", "∞");  // 输出 ∞
        }
        printf("\n");
    }
}

// 求无向图G中顶点v的度
int Degree1(MatGraph g, int v) {
    if (v < 0 || v >= g.n)
        return -1;  // 顶点编号错误返回-1
    int d = 0;
    for (int i = 0; i < g.n; i++) {
        if (g.edges[v][i] > 0 && g.edges[v][i] < INF)  // 统计非 INF 的边数
            d++;
    }
    return d;
}

// 求无向图中所有顶点的度
void DispDegree(MatGraph g) {
    for (int i = 0; i < g.n; i++) {
        int d = Degree1(g, i);
        printf("[%d] %s, 度=%d\n", g.vexs[i].adjvex, g.vexs[i].data, d);
    }
}

// 无向图插入边 （保证对称）
int InsertEdge1(MatGraph &g, int u, int v, int w) {
    if (u < 0 || u >= MAXVEX || v < 0 || v >= MAXVEX)
        return 0;  // 顶点编号错误返回0
    if (w >= INF) return 0;  // 权重不能是 INF
    g.edges[u][v] = w;
    g.edges[v][u] = w;
    if (g.e < MAXVEX * MAXVEX) g.e++;  // 更新边数（防止溢出）
    return 1;
}

// 销毁图（本例中不需要特殊操作）
void DestroyGraph(MatGraph g) {}

int main() {
    MatGraph g;

    g.n = 5;
    g.e = 6;

    // 添加顶点编号
    for (int i = 0; i < g.n; i++) {
        g.vexs[i].adjvex = i;
    }

    // 添加顶点信息
    AddVex(g, 0, "小王");
    AddVex(g, 1, "小李");
    AddVex(g, 2, "小红");
    AddVex(g, 3, "小江");
    AddVex(g, 4, "小丽");

    // 带权的无向图 ，对称矩阵
    int A[MAXVEX][MAXVEX] = {
        {INF, 3, INF, 1, INF},
        {3, INF, 6, INF, INF},
        {INF, 6, INF, 4, 1},
        {1, INF, 4, INF, 3},
        {INF, INF, 1, 3, INF}
    };

    // 根据数组A 建立邻接矩阵
    CreateGraph(g, A, 5, 6);

    // 输出邻接矩阵
    printf("图的邻接矩阵：\n");
    DispGraph(g);

    printf("\n");

    // 输出顶点信息
    printf("图的顶点信息：\n");
    DispVexInfo(g);

    printf("\n");

    // 求顶点v的度
    int v = 0;
    int d = Degree1(g, v);
    printf("顶点 %d 的度 = %d\n", v, d);

    printf("\n");

    // 求所有顶点的度 （无向图）
    printf("顶点的度：\n");
    DispDegree(g);

    return 0;
}