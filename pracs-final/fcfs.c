#include <stdio.h>
#include <stdlib.h>

void findavgtime(int processes[], int bursttime[], int n);
void findwaitingtime(int processes[], int bursttime[], int n, int wt[]);
void findtat(int processes[], int bursttime[], int n, int tat[], int wt[]);

void main()
{
    int processes[] = {1, 2, 3};
    int bursttime[] = {10, 5, 8};
    int n = sizeof(processes) / sizeof(processes[0]);
    findavgtime(processes, bursttime, n);
}

void findavgtime(int processes[], int bursttime[], int n)
{
    int wt[n], tat[n], total_wt = 0, total_tat = 0;
    findwaitingtime(processes, bursttime, n, wt);
    findtat(processes, bursttime, n, tat, wt);
    printf("Processes BT WT TAT\n");
    for (int i = 0; i < n; i++)
    {
        total_wt += wt[i];
        total_tat += tat[i];
        printf("%d %d %d %d\n", processes[i], bursttime[i], wt[i], tat[i]);
    }
    int AWT = (float)total_wt / (float)n;
    int ATAT = (float)total_tat / (float)n;
    printf("Average waiting time: %d", AWT);
    printf("Average turn around time: %d", ATAT);
}

void findwaitingtime(int processes[], int bursttime[], int n, int wt[])
{
    wt[0] = 0;
    for (int i = 1; i < n;i++)
    {
        wt[i] = bursttime[i - 1] + wt[i - 1];
    }
}

void findtat(int processes[],int bursttime[], int n, int tat[], int wt[])
{
    for (int i = 0; i < n;i++)
    {
        tat[i] = bursttime[i] + wt[i];
    }
}