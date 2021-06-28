package program;
import java.util.*;
class Node2
{
	int data;
	Node2 next;
	public Node2(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class insertion_types
{
	public static Node2 head=null;
	public static Node2 temp=null;
	
	void create(int data)
	{
		Node2 nn=new Node2(data);
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
	
	void insert_beg(int in)
	{
		Node2 nn=new Node2(in);
		if(head==null)
		{
			head=nn;
			temp=nn;
		}
		else
		{
			nn.next=head;
			head=nn;
		}
	}
	void insert_mid(int mi,int pos)
	{
		Node2 nn=new Node2(mi);
		temp=head;
		for(int i=1;i<pos;i++)
		{
			temp=temp.next;
		}
		nn.next=temp.next;
		temp.next=nn;
		
		
	}
	void insert_end(int en)
	{
		Node2 nn=new Node2(en);
		if(head==null)
		{
			head=nn;
			temp=nn;
		}
		else
		{
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=nn;
			temp=nn;
			//temp.next=null;
		
			//System.out.println(temp.data);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertion_types obj=new insertion_types();
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
		            case 3: int in=sc.nextInt();
		            	    obj.insert_beg(in);
		            break;
		            case 4: int mi=sc.nextInt();
		            System.out.println("enter position to be inserted :");
		                      int pos=sc.nextInt();
		                    obj.insert_mid(mi,pos);
		            break;
		            case 5: int en=sc.nextInt();
		                    obj.insert_end(en);
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
/*OUTPUT

enter no of elements to be created

5
enter choice
1
1
2
3
4
5
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
enter one to continue
1
enter choice
3
11
enter one to continue
1
enter choice
2
the elements are diplayed as :
11
1
2
3
4
5
enter one to continue
1
enter choice
4
22
enter position to be inserted :
3
enter one to continue
1
enter choice
2
the elements are diplayed as :
11
1
2
22
3
4
5
enter one to continue
1
enter choice
5
33
enter one to continue
1
enter choice
2
the elements are diplayed as :
11
1
2
22
3
4
5
33
*/
