package program;
public class queue_using2stacks {
	int push_stack[]=new int[100];
	int pop_stack[]=new int[100];
	int count=0;
	int top1=-1;
	int top2=-1;
	void push1(int data)
	{
		push_stack[++top1]=data;
	}
	int pop1()
	{
		
		 int a=push_stack[top1];
		 top1--;
		 return a;
	}
	void push2(int data)
	{
		pop_stack[++top2]=data;	
	}
	int pop2()
	{
		int b=pop_stack[top2];
		top2--;
		return b;
	}
	void enqueue(int data)
	{
		 push1(data);  
		 count++;  
	}
	void dequeue()
	{
		for(int i=0;i<count;i++)  
		  {  
		     int element = pop1();  
		     push2(element);  
		  }  
		int b= pop2(); //1st element in stack1
		System.out.println("The dequeued element is"+b);  
		count--;  
		for(int i=0;i<count;i++)  
		{  
		   int a = pop2();  
		   push1(a);   
		}  
	}
	
	void display()  
	{  
	   for(int i=0;i<=top1;i++)  
	  {  
		   System.out.println( push_stack[i]);  
	  }  
	}  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		queue_using2stacks obj=new queue_using2stacks();
		  obj.enqueue(10);  
		   obj.enqueue(20);  
		  obj.enqueue(30);  
		   obj.dequeue();  
		   obj.enqueue(40);  
		  obj.display();  
	}
	
}
/*output
The dequeued element is10
20
30
40
*/
