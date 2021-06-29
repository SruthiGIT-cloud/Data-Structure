 static void printLinkedList(SinglyLinkedListNode head) {
            SinglyLinkedListNode temp;
            temp=head;
           while(temp!=null)
           {
               System.out.println(temp.data);
               temp=temp.next;
           }
    }
