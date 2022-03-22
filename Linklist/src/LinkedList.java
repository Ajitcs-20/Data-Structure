
public class LinkedList {
    Node head;

    public void insert(int data) {  //insert method in which we passing int data
        Node node=new Node();   //obj of class Node
        node.data = data;
        node.next=null;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}
