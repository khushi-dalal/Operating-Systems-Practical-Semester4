/* Dynamic Programming
Edge relaxation technique
Single Source Shortest Path
Time Complexity: O((V+E)logV)*/
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <limits.h>

#define MAX_VERTICES 100
#define MAX_EDGES 100

typedef struct {
    int source;
    int destination;
    int weight;
} Edge;

void bellmanFord(Edge graph[], int numVertices, int numEdges, int source) {
    int distance[MAX_VERTICES];
    for (int i = 0; i < numVertices; i++) {
        distance[i] = INT_MAX;
    }
    
    distance[source] = 0;
    for (int i = 1; i <= numVertices - 1; i++) {
        for (int j = 0; j < numEdges; j++) {
            int u = graph[j].source;
            int v = graph[j].destination;
            int weight = graph[j].weight;
            
            if (distance[u] != INT_MAX && distance[u] + weight < distance[v]) {
                distance[v] = distance[u] + weight;
            }
        }
    }
    
    // Check for negative cycles
    for (int i = 0; i < numEdges; i++) {
        int u = graph[i].source;
        int v = graph[i].destination;
        int weight = graph[i].weight;
        
        if (distance[u] != INT_MAX && distance[u] + weight < distance[v]) {
            printf("Graph contains a negative cycle.\n");
            return;
        }
    }
    
    printf("Vertex\tDistance from Source\n");
    for (int i = 0; i < numVertices; i++) {
        printf("%d\t%d\n", i, distance[i]);
    }
}

int main() {
    int numVertices = 5;
    int numEdges = 8;
    int source = 0;
    
    // Graph representation as an array of edges
    Edge graph[MAX_EDGES] = {
        {0, 1, -1},
        {0, 2, 4},
        {1, 2, 3},
        {1, 3, 2},
        {1, 4, 2},
        {3, 2, 5},
        {3, 1, 1},
        {4, 3, -3}
    };
    bellmanFord(graph, numVertices, numEdges, source);
    return 0;
}
