#include <stdio.h>
#include<stdlib.h>
int choice,d,n,n1,k=0;
int len;

struct node
{
    int data;  
    struct node*next;
};
struct node *head,*nn1,*nn2,*head1,*temp,*old,*old1,*s,*p,*q;
void create();
void alter();
void display();/*
void ibeg();
void imid();
void iend();*/
void main()
{
    do{
        printf("enter choice");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: create();
            break;
            case 2: alter();
            break;
            case 3: display();
            break;
            /*case 4: imid();
            break;
            case 5: iend();
            break;*/
            default: printf("invalid choice");
        }
        printf("enter one to continue");
        scanf("%d",&d);
    }
    while(d==1);
    
}
void create()
{
    struct node*nn1;
    head =(struct node*)malloc(sizeof(struct node));
    printf("enter data");
    scanf("%d",&head->data);
    head->next=NULL;
    old=head;
    printf("how many nodes");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
      nn1 =(struct node*)malloc(sizeof(struct node));
      printf("new node data");
      scanf("%d",&nn1->data);
      nn1->next=NULL;
      old->next=nn1;
      old=nn1;
    }
    struct node*nn2;
    head1=(struct node*)malloc(sizeof(struct node));
    printf("enter data");
    scanf("%d",&head1->data);
    head1->next=NULL;
    old1=head1;
    printf("how many nodes");
    scanf("%d",&n1);
    for(int j=0;j<n1;j++)
    {
      nn2 =(struct node*)malloc(sizeof(struct node));
      printf("new node data");
      scanf("%d",&nn2->data);
      nn2->next=NULL;
      old1->next=nn2;
      old1=nn2;
    }
    
    
    
}
void alter()
{
p=head;
q=head1;
while(p!=NULL && q!=NULL)
{
s=p->next;
p->next=q;
p=s;
s=q->next;
q->next=p;
q=s;
}
}
void display()
{
    temp=head;
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->next;
    }
}

