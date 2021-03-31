#include<stdio.h>
int r=-1,f=-1;
int q[100];
void enqueue(int data,int n)
{
    if(r==-1||f==-1)
    {
        r=f=0;
        q[r]=data;
    }
    else
    {
        r++;
        q[r]=data;
    }
}
void reverse()
{
    int n1=r;
    for(int i=r,j=f;i>n1/2;i--,j++)
    
    {
        int temp=q[j];
        q[j]=q[i];
        q[i]=temp;
    }
    
}
void printz()
{
    for(int i=f;i<=r;i++)
    {
        printf("%d ",q[i]);
    }
}
void main()
{
    int n,data;
    printf("Enter size\n");
    scanf("%d",&n);
    printf("Enter data\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&data);
        enqueue(data,n);
    }
    reverse();
    printz();
}
