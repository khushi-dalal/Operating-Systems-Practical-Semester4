#include <stdio.h>
struct process
{
    int AT, WT, BT, TAT, PT;
};

struct process a[10];

void main()
{
    int n, temp[10], t, count = 0, shortest;
    float Avg_WT, total_WT = 0, Avg_TAT, total_TAT = 0;
    printf("enter the number of processes: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("enter the arrival time, burst time and priority: ");
        scanf("%d%d%d", &a[i].AT, &a[i].BT, &a[i].PT);
        temp[i] = a[i].BT;
    }
    a[9].PT = 9999;
    for (t = 0; count != n; t++)
    {
        shortest = 9;
        for (int i = 0; i < n; i++)
        {
            if (a[shortest].PT > a[i].PT && a[i].BT > 0 && a[i].AT <= t)
                shortest = i;
        }
        a[shortest].BT--;
        if (a[shortest].BT == 0)
        {
            count++;
            a[shortest].WT = t + 1 - a[shortest].AT - temp[shortest];
            a[shortest].TAT = t + 1 - a[shortest].AT;
            total_WT += a[shortest].WT;
            total_TAT += a[shortest].TAT;
        }
    }

    Avg_WT = total_WT / n;
    Avg_TAT = total_TAT / n;

    printf("ID WT TAT\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d %d\t%d\n", i + 1, a[i].WT, a[i].TAT);
    }

    printf("Avg waiting time of the process  is %f\n", Avg_WT);
    printf("Avg turn around time of the process is %f\n", Avg_TAT);
}