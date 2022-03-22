public class LinkedLt {
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


}
public class LinkedList {
    public static void main(String[] args) {
        LinkedLt sll=new LinkedLt();
        sll.insertFirst(11);


    }
}
