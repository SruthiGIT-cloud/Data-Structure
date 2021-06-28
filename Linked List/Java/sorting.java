package program;
import java.util.*;
class Node4
{
	int data;
	Node4 next;
	public Node4(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class sorting {
	public static Node4 head=null;
	public static Node4 temp=null;

	void create(int data)
	{
		Node4 nn=new Node4(data);
		if(head==null)
		{
			head=nn;
			temp=nn;
		}
		else
		{
			temp.next=nn;
			temp=nn;
			temp.next=null;
		}
	}
		public void sort()
		{
			Node4 temp1=head;
			Node4 temp2=head.next;
			
			while(temp1.next!=null)
			{
				while(temp2!=null)
				{
					if(temp1.data>temp2.data)
					{
						Node4 swap=new Node4(0);
						
						swap.data=temp1.data;
						temp1.data=temp2.data;
						temp2.data=swap.data;
					}
					
					temp2=temp2.next;
				}
				temp1=temp1.next;
				temp2=temp1.next;
			}
			System.out.println("sorted data are: ");
			display();
	}
	void display()
	{
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		
       sorting obj=new sorting();
       System.out.println("enter elements");
       for(int i=0;i<n;i++)
       {
       obj.create(sc.nextInt());
       }
       obj.display();
       obj.sort();
	}
}
/*output
enter no of elements
6
enter elements
7
2
3
5
1
6
7
2
3
5
1
6
sorted data are: 
1
2
3
5
6
7

*/
