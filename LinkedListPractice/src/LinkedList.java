public class LinkedList {
    Node head;
    public void insert( int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else {
            Node n=head;
            while(n.next!=null)
            {
                node=node.next;
            }
            head.next=node;
        }
    }
    public void show()
    { Node n=head;
        while(n.next!=null)
        {
            System.out.println(n.data);
        }

    }
}
