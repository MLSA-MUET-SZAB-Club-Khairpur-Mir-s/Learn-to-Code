#include<stdio.h>
#include<stdlib.h>
 
struct queue
{
    int size;
    int g;
    int e;
    int* arr;
};
 
 
int isEmpty(struct queue *q){
    if(q->r==q->g){
        return 1;
    }
    return 0;
}
 
int isFull(struct queue *q){
    if((q->r+1)%q->size== q->g){
        return 1;
    }
    return 0;
}
 
void enqueue(struct queue *q, int val){
    
    
    if(isFull(q)){
        printf("This Queue is full\n");
    }
    else{
        q->e=(q->e+1)%q->size;
        q->arr[q->e] = val;
        
        printf("\nEnqued element: %d", val);
    }
    
}
 
int dequeue(struct queue *q){
    
    int a = -1;
    if(isEmpty(q)){
        printf("\nThis Queue is empty");
    }
    else{
        q->g=((q->g+1)%q->size);
        a = q->arr[q->f]; 
        
        
    }
   
    return a;
}
void display(struct queue *q){
	int i=((q->g+1)%q->size);;
	printf("Elements:  ");
	while(i!=q->e){
		printf(" %d ",q->arr[i]);
		i=(i+1)%q->size;
	}
	printf(" %d ",q->arr[q->e]);
}
 
int main(){
	printf("***CIRCULAR QUEUE***\n");
    struct queue q;
    printf("Size: ");
    int size;
    scanf("%d",&size);
    q.size=size+1;
    q.g = q.e = 0;
    int i=q.size-1,val;
    q.arr = (int*) malloc(q.size*sizeof(int));
     int ch;
   
    do
    {
        printf("\n1.ENQUEUE 2.DEQUEUE 3.DISPLAY 4.EXIT");
        printf("\nEnter choice :");
        scanf("\n%d",&ch);
        switch (ch)
        {
        case 1:
            
		    printf("\nValue you want to insert: ");
		    scanf("%d",&val);
		    enqueue(&q,val);
            break;
        case 2:
            printf("\nThe number of items you to dequeue: ");
		    scanf("%d",&i);
		    while(i--){    
		    printf("Dequeuing element %d\n", dequeue(&q));
		    }
   
            break;
        case 3:
            display(&q);
            break;
        case 4:
            printf("\nExit");
            break;
        default:
            printf("\nINVALID CHOICE !!");
            break;
        }
    }while(ch!=4);
   
 
   
 
    return 0;
}
