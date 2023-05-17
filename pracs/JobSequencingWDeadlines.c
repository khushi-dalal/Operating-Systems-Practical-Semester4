/*Greedy Approach
Time Complexity: O(n^2)*/

#include <stdio.h>

#define MAX_JOBS 100

typedef struct
{
    int id;
    int deadline;
    int profit;
} Job;

void jobSequencing(Job jobs[], int n)
{
    int i, j;
    int maxDeadline = 0;
    int totalProfit = 0;
    int slot[MAX_JOBS];

    for (i = 0; i < n; i++)
    {
        if (jobs[i].deadline > maxDeadline)
        {
            maxDeadline = jobs[i].deadline;
        }
    }

    for (i = 0; i <= maxDeadline; i++)
    {
        slot[i] = -1; // Initialize slots to be empty
    }

    for (i = 0; i < n; i++)
    {
        for (j = jobs[i].deadline; j > 0; j--)
        {
            if (slot[j] == -1)
            {
                slot[j] = i;
                totalProfit += jobs[i].profit;
                break;
            }
        }
    }

    printf("Job sequence: ");
    for (i = 1; i <= maxDeadline; i++)
    {
        if (slot[i] != -1)
        {
            printf("%d ", jobs[slot[i]].id);
        }
    }

    printf("\nTotal profit: %d\n", totalProfit);
}

int main()
{
    Job arr[] = {{1, 2, 100},
                 {2, 1, 19},
                 {3, 2, 27},
                 {4, 1, 25},
                 {5, 3, 15}};
    int n = sizeof(arr) / sizeof(arr[0]);
    jobSequencing(arr, n);
    return 0;
}
