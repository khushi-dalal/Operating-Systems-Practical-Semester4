/* Divide and Conquer Approach
Time Complexities:
1. Best Case: O(n*log(n))
2. Average Case: O(n*log(n))
2. Worst Case: O(n^2)*/

#include<stdio.h>

int myArray[] = {11, 2, 5, 7, 3, 1, 9};
int n = 7;

void swap(int *a, int *b)
{
    int t = *a;
    *a = *b;
    *b = t;
}

int partition(int low, int high)
{
    int pivot = myArray[high];
    int i = low - 1;
    for (int j = low; j < high; j++)
    {
        if (myArray[j] < pivot)
        {
            i++;
            swap(&myArray[i], &myArray[j]);
        }
    }
    swap(&myArray[i + 1], &myArray[high]);
    return (i + 1);
}

void QuickSort(int low, int high)
{
    if (low < high)
    {
        int pi = partition(low, high);
        QuickSort(low, pi - 1);
        QuickSort(pi + 1, high);
    }
}

void main()
{
    printf("Input Array: ");
    for (int i = 0; i < n; i++)
    {
        printf("\t%d", myArray[i]);
    }
    printf("\nQuick Sort....\n");
    QuickSort(0, 6);
    printf("Output Array: ");
    for (int i = 0; i < n; i++)
    {
        printf("\t%d", myArray[i]);
    }
}