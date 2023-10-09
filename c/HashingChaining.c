#include <stdio.h>
#include <stdlib.h>



struct node
{
    int data;
    struct node *next;
};




/*void insert(int value,int size)
{

    struct node *newNode = malloc(sizeof(struct node));
    newNode->data = value;
    newNode->next = NULL;

    int key = value % size;

    if(chain[key] == NULL){

        chain[key] = newNode;}

    else
    {

        struct node *temp = chain[key];
        while(temp->next)
        {
            temp = temp->next;
        }

        temp->next = newNode;
    }
}*/

/*void print(int size)
{
    int i;

    for(i = 0; i < size; i++)
    {
        struct node *temp = chain[i];
        printf("chain %d ->",i);
        while(temp!=NULL)
        {
            printf("%d -->",temp->data);
            temp = temp->next;
        }
        printf("NULL\n");
    }
}
*/
int main()
{
     int size;
     printf("Size: ");
     scanf("%d",&size);
     struct node *chain[size];
     int j;
    for(j = 0; j < size; j++){
        chain[j] = NULL;
    }

    int n;
    printf("the number of items you want to add : ");
    scanf("%d",&n);
    while(n--){
        int value;
        printf("Enter the value:");
        scanf("%d",&value);
        struct node *newNode = malloc(sizeof(struct node));
        newNode->data = value;
        newNode->next = NULL;

    int key = value % size;

    if(chain[key] == NULL){

        chain[key] = newNode;}

    else
    {

        struct node *temp = chain[key];
        while(temp->next)
        {
            temp = temp->next;
        }

        temp->next = newNode;
    }

    }


   for(i = 0; i < size; i++)
    {
        struct node *temp = chain[i];
        printf("chain %d ->",i);
        while(temp!=NULL)
        {
            printf("%d -->",temp->data);
            temp = temp->next;
        }
        printf("NULL\n");
    }

    return 0;
}
