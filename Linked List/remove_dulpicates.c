
#include <stdio.h>
#include<stdlib.h>
int n,choice,d;
struct node
{
    int data;  
    struct node*next;
};
struct node *temp1,*head,*nn,*old,*temp2,*old1,*head2,*temp3,*p,*q;
void create();
void rearrange();
void display();
void main()
{
    do{
        printf("enter choice");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: create();
            break;
            case 2: rearrange();
            break;
            case 3: display();
            break;
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
    old=head2=head;
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
void rearrange()
{  
    temp1=head;
   while(temp1!=NULL)
   {
       old1=temp1;
       temp2=temp1->next;
       while(temp2!=NULL)
       {
           if(temp1->data==temp2->data)
           {
               q=temp2;
               temp2=temp2->next;
               old1->next=temp2;
              
                q->next=NULL;
           }
           else
           {
               old1=temp2;
               temp2=temp2->next;
           }
       }
       temp1=temp1->next;
      
   }
}

void display()
{
    temp3=head2;
    
    while(temp3!=NULL)
    {
        printf("%d ",temp3->data);
        temp3=temp3->next;
    }
    
}

