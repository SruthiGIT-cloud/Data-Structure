
#include <stdio.h>
#include<stdlib.h>
int choice,d,n;

struct node
{
    int data;  
    struct node*next;
};
struct node *head,*nn,*temp,*current,*prev,*next,*old;
void create();
void display();
void rev();
void main()
{
    do{
        printf("enter choice");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: create();
            break;
            case 2: display();
            break;
            case 3: rev();
            break;
           
            default: printf("invalid choice");
        }
        printf("enter one to continue");
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
void display()
{
    struct node*temp;
    temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}
void rev()
{
    current=head;
    prev=NULL;
    while(current!=NULL)
    {
        next=current->next;
        current->next=prev;
        prev=current;
        current=next;
    }
    head=prev;
    display();
}

