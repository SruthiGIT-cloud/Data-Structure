class Node 
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class ds
{
    public static Node head=null;
    public static Node temp=null;
    
    public void create(int data)
    {
        Node nn=new Node(data);
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
       public void display()
       {
          temp=head;
           while(temp!=null)
           {
               System.out.println(temp.data);
               temp=temp.next;
           }
       }
      
	public static void main(String[] args) 
	{
	    	ds obj=new ds();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("ENTER NO OF ELEMENTS");
	   int n=sc.nextInt();
	   for(int i=0;i<n;i++)
	   {
	       obj.create(sc.nextInt());
	   }
	   obj.display();
	   
	
	}
}
