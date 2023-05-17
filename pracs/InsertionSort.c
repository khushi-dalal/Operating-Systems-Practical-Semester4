/*Iterative Approach
Time complexities: 
1. Best Case: O(n)
2. Average Case: O(n^2)
3. Worst Case: O(n^2)*/

#include <stdio.h>
#include <stdlib.h>

int myArray[] = {2, 1, 4, 3, 5, 8, 10, 1}, n = 8;

void insertionSort()
{
    int i, j, key;
    for (j = 1; j < n; j++)
    {
        key = myArray[j];
        i = j - 1;
        while (i >= 0 && myArray[i] > key)
        {
            myArray[i + 1] = myArray[i];
            i--;
        }
        myArray[i + 1] = key;
    }
}
void main()
{
    printf("Input Array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", myArray[i]);
    }
    printf("\nInsertion Sort....\n");
    insertionSort();
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", myArray[i]);
    }
}
