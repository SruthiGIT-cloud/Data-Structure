//Input : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] 
//k = 5
//Output : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
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
void reverse(int k)
{
  k=k-1;
    for(int i=f,j=k;i<j;j--,i++)
    
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
    int n,data,k;
    printf("Enter size\n");
    scanf("%d",&n);
    printf("Enter data\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&data);
        enqueue(data,n);
    }
    printf("Enter k value\n");
    scanf("%d",&k);
    reverse(k);
    printz();
}

