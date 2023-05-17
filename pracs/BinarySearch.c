/* Divide and Conquer Approach
Time Complexities:
1. Best Case: O(1)
2. Average Case: O(log(n))
2. Worst Case: O(log(n))*/

#include<stdio.h>
#include<stdlib.h>

int myArray[] = {1, 2, 5, 7, 11, 23, 45, 67};
int n = 8;

int BinarySearch(int low, int x, int high)
{
    if(low<=high)
    {
        int mid = (low + high) / 2;
        if(x==myArray[mid]){
            return mid;
        }
        if(x<myArray[mid]){
            return BinarySearch(low, x, mid-1);
        }
        else{
            return BinarySearch(mid+1, x, high);
        }
    }
    return -1;
}

void main()
{
    int x = 7; // element to be searched
    int out = BinarySearch(0, x, n-1);
    if (out == -1)
    {
        printf("Element not found...\n");
    }
    else
    {
        printf("Element found at index %d\n", out);
    }
}