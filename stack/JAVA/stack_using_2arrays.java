package program;

public class stack_using_2arr {
int size=6;
int top1=-1;
int top2=size;
int arr[]=new int[size];
	void push1(int data)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1]=data;
		}
	}
	int pop1()
	{
		if(top1>=0)
		{
			int a=arr[top1];
			top1--;
			return a;
		}
		display();
		return 0;
	}
	void push2(int data1)
	{
		if(top1<top2-1)
		{
			top2--;
			arr[top2]=data1;
		}
	
	}
	
	int pop2()
	{
		if(top1>=0)
		{
			int b=arr[top2];
			top2--;
			return b;
		}
		display();
		return 0;
		
	}	
	void display()
	{
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		stack_using_2arr ts=new stack_using_2arr();
		ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());
ts.push2(40);
System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());
ts.display();
	
}
}
/*
output:
Popped element from stack1 is 11
Popped element from stack2 is 40
10 15 7 40 11 5 
*/
