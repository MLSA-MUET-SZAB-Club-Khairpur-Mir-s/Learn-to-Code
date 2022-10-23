#include<stdio.h>
#include<malloc.h>
struct node
{
    int data;
    struct node *link;
};

struct node *push(struct node *top)
{
    struct node *new;
    new=(struct node*)malloc(sizeof(struct node));
    int x;
    printf("\nEnter data :");
    scanf("\n%d",&x);
    new->data=x;
    if(top->data==NULL){
	top=new;	
	}
	else{
    new->link=top;
    top=new;
	}
    return top;
}
void peek(struct node * top)
	{
		int pos,i;
		printf("\nenter the position: ");
		scanf("%d",&pos);
	struct node *new;
	new=top;
	for(i=0;(i<pos-1 && new!=NULL);i++){
    
	new=new->link;
	}
	printf("\n%d",new->data);
	
}
struct node *pop(struct node * top)
{
    struct node *temp;
    temp=top;
    if(top==0)
    {
        printf("\nThere is no element in the stack.");
    }
    else
    {
        printf("\nPopped item = %d",top->data);
        top=top->link;
        free(temp);
    }
    return top;
}
void display(struct node * top)
{
    struct node* temp;
    temp=top;
    if(top==NULL)
    {
        printf("\nThere is no element !! ");
    }
    else 
    {
        while(temp!=NULL)
        {
            printf("\n%d",temp->data);
            temp=temp->link;
        }
	}
}
void main()

{
	struct node *top;
	top=(struct node*)malloc(sizeof(struct node));
	top->link=NULL;
	top->data=NULL;
    int ch;
    printf("\Press 0 to exit else enter 1: ");
    scanf("\n%d",&ch);
    while(ch!=0)
    {
        printf("\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY");
        printf("\nEnter choice :");
        scanf("\n%d",&ch);
        switch (ch)
        {
        case 1:
            top=push(top);
            break;
        case 2:
            top=pop(top);
            break;
        case 3:
            peek(top);
            break;
        case 4:
            display(top);
            break;
        default:
            printf("\nINVALID CHOICE !!");
            break;
        }
    }

}
