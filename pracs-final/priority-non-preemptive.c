#include <stdio.h>

// Function to swap two variables
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void main()
{
    int n;
    printf("Enter Number of Processes: ");
    scanf("%d", &n);
    
    // Arrays for burst time, priority, arrival time, and process id
    int b[n], p[n], a[n], index[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter Arrival Time, Burst Time, and Priority Value for Process %d: ", i + 1);
        scanf("%d %d %d", &a[i], &b[i], &p[i]);
        index[i] = i + 1;
    }
    
    // Sorting the processes based on priority (non-preemptive)
    for (int i = 0; i < n; i++)
    {
        int highestPriority = p[i];
        int highestPriorityIndex = i;
        for (int j = i; j < n; j++)
        {
            if (p[j] > highestPriority)
            {
                highestPriority = p[j];
                highestPriorityIndex = j;
            }
        }
        // Swapping processes
        swap(&p[i], &p[highestPriorityIndex]);
        swap(&b[i], &b[highestPriorityIndex]);
        swap(&a[i], &a[highestPriorityIndex]);
        swap(&index[i], &index[highestPriorityIndex]);
    }
    
    printf("Process Id     Arrival Time     Burst Time   Wait Time    Turnaround Time\n");
    
    int waitTime = 0;
    for (int i = 0; i < n; i++)
    {
        int turnaroundTime = waitTime + b[i] - a[i];
        printf("P%d\t\t%d\t\t%d\t\t%d\t\t%d\n", index[i] ,a[i], b[i], waitTime, turnaroundTime);
        waitTime += b[i];
    }
}
