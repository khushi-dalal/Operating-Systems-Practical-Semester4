/* Iterative Approach
Time Complexity All: O(n^2)*/

#include <stdio.h>
#include <stdlib.h>

int myArray[] = {2, 1, 4, 3, 5, 8, 10, 1}, n = 8;

void SelectionSort()
{
    int minIndex, temp;
    for (int i = 0; i < n-1;i++){
        minIndex = i;
        for (int j = i+1; j < n;j++){
            if(myArray[j]<myArray[minIndex]){
                minIndex = j;
            }
            temp = myArray[minIndex];
            myArray[minIndex] = myArray[i];
            myArray[i] = temp;
        }
    }
}
void main()
{
    printf("Input Array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", myArray[i]);
    }
    printf("\nSelection Sort....\n");
    SelectionSort();
    for (int i = 0; i < n; i++)
    {
        printf("%d\t", myArray[i]);
    }
}