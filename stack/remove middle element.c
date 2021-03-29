#include <stdio.h>
#include<stdlib.h>
#define n1 10
int s[n1];
int s2[n1];
int top=-1;
int top2=-1;
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


void display(int ans)
{
  while(top>=0)
  {
      if(top==ans)
      {
          top--;
          continue;
      }
   top2++;
  s2[top2]=s[top];
  top--;
}
for(int i=top2;i>=0;i--)
{
    printf("%d ",s2[i]);
}
}

int main()
{
    
    int n=0,ans;
    scanf("%d",&n);
    if(n%2!=0)
    {
        ans=(n)/2;
    }
    else
    {
        ans=n-1;
    }
    for(int i=0;i<n;i++)
    {
        push();
    }
    display(ans);

    return 0;
}

