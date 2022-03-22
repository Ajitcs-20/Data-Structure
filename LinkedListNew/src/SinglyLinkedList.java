public class SinglyLinkedList {
    public ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void print()
    { ListNode n=head;
        while(n.next!=null)
        {
            System.out.print(n.data+"->");
            n= n.next;
        }
        System.out.println("null");
    }

    public int lenght()
    { if(head==null) {return 0;}
        int count=0;
        ListNode current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public void insertFirst(int value)
    {
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int value)
    {
        ListNode newNode=new ListNode(value);
        if(head==null) {
            head = newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.lenght();
        sll.insertFirst(5);
        sll.insertLast(8);
        sll.print();
    }
}
