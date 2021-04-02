#include<stdio.h>
int r=-1,f=-1;
int q[100];
int q2[100];

void enqueue(int size,int data)
{
    if(r==-1&&f==-1)
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
void interleave(int size)
{
    int i=0;
    int n=size/2;
    int f1=f;
    while(i<=r)
    {
        if(i%2!=0&&n<r)
        {
            
            q2[i]=q[n];
            n++;
            i++;
        }
        else
        {
            q2[i]=q[f1];
            f1++;
            i++;
        }
        q2[r]=q[r];
    }
}
void print()
{
    for(int i=f;i<=r;i++)
    {
        printf("%d ",q2[i]);
    }
}
void main()
{
    int size,data;
    printf("Enter size");
    scanf("%d",&size);
    printf("Enter data");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&data);
        enqueue(size,data);
    }
    interleave(size);
    print();
    
}
