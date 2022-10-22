#include <stdio.h>
#include<stdlib.h>

struct stack{
    int size;
    int top;
    int * arr;
};

int isEmpty(struct stack * ptr){
    if(ptr->top == -1){
        return 1;
    }else{
        return 0;
    }
}

int isFull(struct stack * ptr){
    if(ptr->top==ptr->size-1){
        return 1;
    }else{
        return 0;
    }
}

void push(struct stack * ptr, int val){
    if(isFull(ptr)){
        printf("Stack Overflow!\n");
    }else{
        ptr->top++;
        ptr->arr[ptr->top] = val;
        printf("%d is pushed into the stack\n", val);
    }
}

int pop(struct stack * ptr){
    if(isEmpty(ptr)){
        printf("Stack Underflow!\n");
    }else{
        int val = ptr->arr[ptr->top];
        ptr->top--;
        return val;
    }
}

int main(){
    struct stack * s = (struct stack *)malloc(sizeof(struct stack));
    s->size = 5;
    s->top=-1;
    s->arr = (int *) malloc(s->size * sizeof(int));
    int p1, p2, p3, p4, p5;
    printf("Enter the 1st element to push: ");
    scanf("%d", &p1);
    push(s,p1);
    printf("Enter the 2nd element to push: ");
    scanf("%d", &p2);
    push(s,p2);
    printf("Enter the 3rd element to push: ");
    scanf("%d", &p3);
    push(s,p3);
    printf("Enter the 4th element to push: ");
    scanf("%d", &p4);
    push(s,p4);
    printf("Enter the 5th element to push: ");
    scanf("%d", &p5);
    push(s,p5);

    printf("Popped element is %d\n", pop(s));
    printf("Popped element is %d\n", pop(s));
    printf("Popped element is %d\n", pop(s));
    printf("Popped element is %d\n", pop(s));
    printf("Popped element is %d\n", pop(s));
    return 0;
}
