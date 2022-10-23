#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *prev;
    struct Node *next;
};

void TraversalInForward(struct Node *head){
    struct Node *ptr = head;
    while(ptr!=NULL){
        printf("Element is %d\n", ptr->data);
        ptr = ptr->next;
    }
}

void TraversalInBackward(struct Node *N4){
    struct Node *ptr = N4;
    while(ptr!=NULL){
        printf("Element is %d\n", ptr->data);
        ptr = ptr->prev;
    }
}

int main(){

    struct Node *head;
    struct Node *N2;
    struct Node *N3;
    struct Node *N4;

    // Allocate memory for nodes in the linked list in Heap
    head = (struct Node *)malloc(sizeof(struct Node));
    N2 = (struct Node *)malloc(sizeof(struct Node));
    N3 = (struct Node *)malloc(sizeof(struct Node));
    N4 = (struct Node *)malloc(sizeof(struct Node));

    // Link first and second nodes
    head->data = 4;
    head->prev = NULL;
    head->next = N2;

    // Link second and third nodes
    N2->data = 3;
    N2->prev = head;
    N2->next = N3;

    // Link third and fourth nodes
    N3->data = 6;
    N3->prev = N2;
    N3->next = N4;

    // Terminate the list at the third node
    N4->data = 1;
    N4->prev = N3;
    N4->next = NULL;

    TraversalInForward(head);
    TraversalInBackward(N4);
    return 0;
}
