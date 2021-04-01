
#include <stdio.h>
#include<stdlib.h>
int choice,d,n,len;

struct node
{
    int data;  
    struct node*next;
};
struct node *head,*nn,*temp,*current,*prev,*next,*old,*p;
void create();
void middle();
void method2();
void main()
{
    do{
        printf("enter choice");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: create();
            break;
            case 2: middle();
            break;
            case 3: method2();
            break;
           /* case 4: imid();
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
void middle()

{
p=old=head;
if(head!=NULL)
{
while(p!=NULL&&p->next!=NULL)
{
p=p->next->next;
old=old->next;
}
printf("%d",old->data);
}
}
void method2()
{
    len=(n+1)/2;
    temp=head;
    for(int j=0;j<len;j++)
    {
        temp=temp->next;
    }
    printf("%d",temp->data);
}
    

