/* Divide and Conquer Approach
Time Complexity all: O(n*log(n))*/

#include <stdio.h>
#include <stdlib.h>

int a[] = {4, 1, 5, 9, 2, 3, 5, 79, 0},b[9];
int n = 9;

int merge(int low, int mid, int high)
{
    int h = low;
    int i = low;
    int j = mid + 1;
    while (h <= mid && j <= high)
    {
        if (a[h] <= a[j])
        {
            b[i] = a[h];
            h++;
        }
        else
        {
            b[i] = a[j];
            j++;
        }
        i++;
    }
    if (h > mid)
    {
        for (int k = j; k <= high; k++)
        {
            b[i] = a[k];
            i++;
        }
    }
    else
    {
        for (int k = h; k <= mid; k++)
        {
            b[i] = a[k];
            i++;
        }
    }
    for (int k = low; k <= high; k++)
    {
        a[k] = b[k];
    }
}
void mergesort(int low, int high)
{
    if (low < high)
    {
        int mid = (low + high) / 2;
        mergesort(low, mid);
        mergesort(mid + 1, high);
        merge(low, mid, high);
    }
}
void printArray(int a[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");
}
void main()
{
    printf("\nentered array is: ");
    printArray(a, n);
    printf("\nsorted array is: ");
    mergesort(0, n - 1);
    printArray(b, n);
}
