#include <stdio.h>
#include <stdlib.h>

int mutex = 1, empty = 10, full = 0, x = 0;

void Producer()
{
    --mutex;
    full++;
    empty--;
    printf("Producer produces item %d...\n", ++x);
    mutex++;
}

void Consumer()
{
    --mutex;
    full--;
    empty++;
    printf("Consumer consumes item %d...\n", x--);
    mutex++;
}

void main()
{
    int choice = 0;
    #pragma omp critical
    while (choice != 3)
    {
        printf("***PRODUCER CONSUMER PROBLEM***\n1. Produce\n2. Consume\n3. Exit\nEnter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
        if(mutex==1 && empty!=0)
            Producer();
        else
            printf("Buffer is full...\n");
            break;
        case 2:
        if(mutex==1 && full!=0)
            Consumer();
        else
            printf("Buffer is empty...\n");
            break;
        case 3:
            break;
        default:
            printf("invalid input");
        }
    }
}