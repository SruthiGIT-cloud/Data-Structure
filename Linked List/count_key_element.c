//function that counts the number of times a given int occurs in a Linked List

#include <stdio.h>
#include<stdlib.h>
int choice,d,n,c=0,key;

struct node
{
    int data;  
    struct node*next;
};
struct node *head,*nn,*temp,*current,*prev,*next,*old;
void create();
void count();
void main()
{
    do{
        printf("enter choice");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: create();
            break;
            case 2: count();
            break;
            
           /* case 4: imid();
            break;
            case 5: iend();
            break;*/
            default: printf("invalid choice");
        }
        printf("\nenter one to continue");
        scanf("%d",&d);
    }
    while(d==1);
}
void create()
{
    struct node*nn;
    head =(struct node*)malloc(sizeof(struct node));
    printf("enter data");
    scanf("%d",&head->data);
    head->next=NULL;
    old=head;
    printf("how many nodes");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
      nn =(struct node*)malloc(sizeof(struct node));
      printf("new node data");
      scanf("%d",&nn->data);
      nn->next=NULL;
      old->next=nn;
      old=nn;
    }
}
void count()
{
    printf("Enter the key element to be counted");
    scanf("%d",&key);
    struct node*temp;
    temp=head;
    while(temp!=NULL)
    {
        if(temp->data==key)
        {
            c++;
        }
       
        temp=temp->next;
    }
    if(c>1)
    {
     printf("%d",c);
    }
    else
    {
        printf("No such element");
    }
}

