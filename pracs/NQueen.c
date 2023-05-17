/* Backtracking
Time Complexity: O(n^2)*/
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int x[10];
int count = 0;

bool place(int k, int i) {
    for (int j = 1; j < k; j++) 
        if (abs(x[j] - i) == abs(k - j) || x[j] == i) 
            return false;
    return true;
}

void print_sol(int n) {
    printf("\n\nSolution #%d:\n", count);
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (x[i] == j) {
                printf("Q\t");
            } else {
                printf("*\t");
            }
        }
        printf("\n");
    }
}

void queen(int k, int n) {
    for (int i = 1; i <= n; i++) {
        if (place(k, i)) {
            x[k] = i;
            if (k == n) {
                count++;
                print_sol(n);
            } else {
                queen(k + 1, n);
            }
        }
    }
}

int main() {
    int n;
    printf("Enter the number of Queens: ");
    scanf("%d", &n);
    queen(1, n);
    printf("\nTotal solutions = %d\n", count);
    return 0;
}
