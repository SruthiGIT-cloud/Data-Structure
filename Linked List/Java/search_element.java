package program;
import java.util.*;
class Node1
{
	int data;
	Node1 next;
	public Node1(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class dsex1 {
	public static Node1 head=null;
	public static Node1 temp=null;
	public static int c=0;
	void create(int data)
	{
		Node1 nn=new Node1(data);
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
	void display(int s)
	{
		
		temp=head;
		while(temp.data!=s)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("ELEMENT TO BE SEARCHED");
		int s=sc.nextInt();
		
       dsex1 obj=new dsex1();
       for(int i=0;i<n;i++)
       {
       obj.create(sc.nextInt());
       }
       obj.display(s);
	}

}
