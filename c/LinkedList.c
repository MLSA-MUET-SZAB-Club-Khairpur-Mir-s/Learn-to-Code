#include<stdio.h>
#include<malloc.h>
struct node
{
    int data;
    struct node *next;
};

struct node *InsertionAtBeginning(struct node *head,int data)
{
	struct node *ptr=(struct node*)malloc(sizeof(struct node));
	ptr->data=data;
	if(head->data==NULL){
		head=ptr;
		head->next=NULL;
	}
	else{
	
	ptr->next=head;
	head=ptr;
   }
	return head;
	
}
struct node *InsertionInBetween(struct node *head,int data,int index)
{
	struct node *ptr=(struct node*)malloc(sizeof(struct node));
	ptr->data=data;
	struct node *p=head;
	int i=0;
	while(i!=index-1){
		p=p->next;
		i++;
	}
	ptr->next=p->next;
	p->next=ptr;
	
	return head;
	
}
struct node *InsertionAtEnd(struct node *head,int data,int size)
{
	struct node *ptr=(struct node*)malloc(sizeof(struct node));
	ptr->data=data;
	int i=0;
	struct node *p=head;
	while(i!=size-1){
		p=p->next;
		i++;
	}
	p->next=ptr;
	ptr->next=NULL;
	
	
	return head;
	
}
struct node *InsertionAtAnyPosition(struct node *head,int data,int index)
{
	int i=0;
	struct node *p=head;
	if(index==0){
		head=InsertionAtBeginning(head,data);
	}
	else {
		
		while(p!=NULL){
		p=p->next;
		i++;}
	
		if(index<i){
		  	head=InsertionInBetween(head,data,index);
		}
		else{
			head=InsertionAtEnd(head,data,i);
		}
	}
	return head;
	
	}
	// Case 1: Deleting the first element from the linked list
struct node * deleteFirst(struct node * head){
    struct node * ptr = head;
    head = head->next;
    free(ptr);
    return head;
}
// Case 2: Deleting the element at a given index from the linked list
struct node * deleteAtIndex(struct node * head, int index){
    struct node *p = head;
    struct node *q = head->next;
    int i;
    for (i = 0; i < index-1; i++)
    {
        p = p->next;
        q = q->next;
    }
    
    p->next = q->next;
    free(q);
    return head;
}
// Case 3: Deleting the last element
struct node * deleteAtLast(struct node * head){
    struct node *p = head;
    struct node *q = head->next;
    while(q->next !=NULL)
    {
        p = p->next;
        q = q->next;
    }
    
    p->next = NULL;
    free(q);
    return head;
}
struct node *DeletionAtAnyPosition(struct node *head,int index)
{
	int i=0;
	struct node *p=head;
	if(index==0){
		head=deleteFirst(head);
	}
	else {
		
		while(p!=NULL){
		p=p->next;
		i++;}
	
		if(index<i){
		  	head=deleteAtIndex(head,index);
		}
		else{
			head=deleteAtLast(head);
		}
	}
	return head;
	
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
            printf("%d  ",temp->data);
            temp=temp->next;
        }
	}
}
void main()
{
	struct node *head;
	head=(struct node*)malloc(sizeof(struct node));
	head->next=NULL;
	head->data=NULL;
//	top=pop(top);
    int ch,data,index,r;
    printf("\nPress 0 to exit else enter 1: ");
    scanf("\n%d",&ch);
    
    while(ch!=0)
    {
        printf("\n1.INSERTION\n2.DISPLAY\n3.DELETION");
        printf("\nEnter choice :");
        scanf("\n%d",&ch);
        switch (ch)
        {
        case 1:
        printf("\nThe number of itmes you want to insert: ");
        scanf("%d",&r);
        while(r--){
        	printf("Enter the value: ");
        	scanf("%d",&data);
        	printf("Enter the index: ");
        	scanf("%d",&index);
            head=InsertionAtAnyPosition(head,data,index);}
            break;
       
        case 2:
            display(head);
            break;
        case 3:
        	printf("Enter the index: ");
        	scanf("%d",&index);
            head=DeletionAtAnyPosition(head,index);
            break;
        default:
            printf("\nINVALID CHOICE !!");
            break;
        }
    }

}
