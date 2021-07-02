package program;
import java.util.*;
public class stack {
	int arr[]=new int[100];
	int top=-1;
	
	void push(int data)
	{
		arr[++top]=data;
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("cannot pop as there is no element");
			return -1;
		}
		else
		{
		return arr[--top];
		}
	}
	void peek()
	{
		System.out.println( arr[top]);
	}
	void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		stack obj=new stack();
		int d,choice;
	    Scanner sc=new Scanner(System.in);
	    do
	    {
	        System.out.println("enter choice");
	         choice=sc.nextInt();
	        switch(choice)
	        {
	            case 1: 
	            	System.out.println("enter total no of elements");
	   	         int n=sc.nextInt();
	            	System.out.println("enter elements to be inserted :");
	            	for(int i=0;i<n;i++)
	        		{
	        			obj.push(sc.nextInt());
	        		};
	            break;
	            case 2:System.out.println("the elements are diplayed as :");
	                   obj.display();
	            break;
	            case 3: System.out.println("the elements deleted is :");
	            	    obj.pop();
	            break;
	            case 4: 
	            System.out.println("the top element is :");
	                    
	                    obj.peek();
	            break;
	           
	           
	            default: System.out.println("invalid choice");
	        }
	        System.out.println("enter one to continue");
	        d=sc.nextInt();
	    }
	    while(d==1);
		      
	}
}

/*OUTPUT

enter choice
1
enter total no of elements
4
enter elements to be inserted :
1
2
3
4
enter one to continue
1
enter choice
2
the elements are diplayed as :
4
3
2
1
enter one to continue
1
enter choice
3
the elements deleted is :
enter one to continue
1
enter choice
2
the elements are diplayed as :
3
2
1
enter one to continue
1
enter choice
3
the elements deleted is :
enter one to continue
1
enter choice
4
the top element is :
2
enter one to continue
*/
