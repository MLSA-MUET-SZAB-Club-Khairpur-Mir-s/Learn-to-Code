#include <stdio.h>

void display(int arr[], int *size){
    printf("Array is: ");
    for (int i = 0; i < *size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int insertionBegin(int arr[], int *size){
    int element;
    printf("Insertion at beginning\n");
    printf("Enter the element: ");
    scanf("%d", &element);
    for(int i = (*size)-1; i >= 0; i--)
    {
        arr[i+1] = arr[i];
    }
    arr[0] = element;
    *size += 1;
    return 1;
}

int insertionEnd(int arr[], int *size){
    int element;
    printf("Insertion at end\n");
    printf("Enter the element: ");
    scanf("%d", &element);
    arr[*size] = element;
    *size += 1;
    return 1;
}

int insertionIndex(int arr[], int *size){
    int element, index;
    printf("Insertion at any position\n");
    printf("Enter the index where you want to insert the element: ");
    scanf("%d", &index);
    printf("Enter the element: ");
    scanf("%d", &element);
    for(int i = (*size)-1; i >= index; i--)
    {
        arr[i+1] = arr[i];
    }
    arr[index] = element;
    *size += 1;
    return 1;
}

int main(){
    int arr[100] = {2, 4, 9, 1, 74};
    int size = 5;
    display(arr, &size);
    insertionBegin(arr, &size);
    display(arr, &size);
    insertionEnd(arr, &size);
    display(arr, &size);
    insertionIndex(arr, &size);
    display(arr, &size);
    return 0;
}
