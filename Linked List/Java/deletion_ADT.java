package program;
import java.util.*;
class Node3
{
	int data;
	Node3 next;
	public Node3(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class deletion_types
{
	public static Node3 head=null;
	public static Node3 temp=null;
	
	void create(int data)
	{
		Node3 nn=new Node3(data);
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
	void display()
	{
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	void del_beg()
	{
			temp=head;
			head=head.next;
			temp=null;
		
	}
	void del_mid(int pos)
	{
		
		temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp=null;
		
		
	}
	void del_end()
	{
		
			temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deletion_types obj=new deletion_types();
		Scanner sc=new Scanner(System.in);
		int d;
		int choice;
		System.out.println("enter no of elements to be created");
		int n=sc.nextInt();
		{
		    do{
		        System.out.println("enter choice");
		         choice=sc.nextInt();
		        switch(choice)
		        {
		            case 1: 
		            	for(int i=0;i<n;i++)
		        		{
		        			obj.create(sc.nextInt());
		        		};
		            break;
		            case 2:System.out.println("the elements are diplayed as :");
		                   obj.display();
		            break;
		            case 3: 
		            	    obj.del_beg();
		            break;
		            case 4: 
		            System.out.println("enter position to be inserted :");
		                      int pos=sc.nextInt();
		                    obj.del_mid(pos);
		            break;
		            case 5: 
		                    obj.del_end();
		            break;
		           
		            default: System.out.println("invalid choice");
		        }
		        System.out.println("enter one to continue");
		         d=sc.nextInt();
		    }
		    while(d==1);
		}

	}

}
/*OUTPUT:
enter no of elements to be created
7
enter choice
1
1
2
3
4
5
6
7
enter one to continue
1
enter choice
2
the elements are diplayed as :
1
2
3
4
5
6
7
enter one to continue
1
enter choice
3
enter one to continue
1
enter choice
2
the elements are diplayed as :
2
3
4
5
6
7
enter one to continue
1
enter choice
2
the elements are diplayed as :
2
3
4
5
6
7
enter one to continue
1
enter choice
4
enter position to be inserted :
5
enter one to continue
1
enter choice
2
the elements are diplayed as :
2
3
4
5
7
enter one to continue
1
enter choice
2
the elements are diplayed as :
2
3
4
5
7
enter one to continue
1
enter choice
5
enter one to continue
1
enter choice
2
the elements are diplayed as :
2
3
4
5
enter one to continue
*/
