#include <stdio.h>
#include<stdlib.h>
#define n1 10
int s[n1];
int top=-1;
void push()
{
    if(top>=n1)
    {
        printf("Stack is FULL!!");
    }
    else
    {
        top++;
        int data=0;
        printf("Enter the data:");
        scanf("%d",&data);
        s[top]=data;
    }
  
}


void display(int n)
{
   int n2=n-1;
    for(int i=n2;i>=1;i--)
    {
        for(int j=i-1;j>=0;j--)
        {
            if(s[i]>s[j])
            {
                int temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
        }
    }
    top=n2;
    while(top>=0)
    {
        printf("%d ",s[top]);
        top--;
    }
}

int main()
{
    
    int n=0;
    scanf("%d",&n);
    
    for(int i=0;i<n;i++)
    {
        push();
    }
    display(n);

    return 0;
}

