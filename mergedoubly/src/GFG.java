public class GFG {

    static class Node
        {

            int data;

            Node next, prev;
        }

        static Node insert(Node head_ref, int data)
        {

            Node new_node = new Node();

            new_node.data = data;
            if (head_ref == null)

            {

                new_node.next = new_node;

                new_node.prev = new_node;

            }


            else

            {
                Node last = (head_ref).prev;

                new_node.next = head_ref;

                new_node.prev = last;

                last.next = (head_ref).prev = new_node;

            }


            head_ref = new_node;

            return head_ref;
        }

        static Node merge(Node first, Node second)
        {

            if (first == null)

                return second;

            if (second == null)

                return first;

            if (first.data < second.data)

            {

                first.next = merge(first.next, second);

                first.next.prev = first;

                first.prev = null;

                return first;

            }

            else

            {

                second.next = merge(first, second.next);

                second.next.prev = second;

                second.prev = null;

                return second;

            }
        }
        static Node mergeUtil(Node head1, Node head2)
        {

            if (head1 == null)

                return head2;

            if (head2 == null)

                return head1;

            Node last_node;

            if (head1.prev.data < head2.prev.data)

                last_node = head2.prev;

            else

                last_node = head1.prev;

            head1.prev.next = head2.prev.next = null;


            Node finalHead = merge(head1, head2);

            finalHead.prev = last_node;

            last_node.next = finalHead;


            return finalHead;
        }


        static void printList(Node head)
        {

            Node temp = head;


            while (temp.next != head)

            {

                System.out.print ( temp.data+ " ");

                temp = temp.next;

            }

            System.out.print ( temp.data + " ");
        }


        public static void main(String args[])
        {

            Node head1 = null, head2 = null;




            head1 = insert(head1, 8);

            head1 = insert(head1, 5);

            head1 = insert(head1, 3);

            head1 = insert(head1, 1);




            head2 = insert(head2, 11);

            head2 = insert(head2, 9);

            head2 = insert(head2, 7);

            head2 = insert(head2, 2);


            Node newHead = mergeUtil(head1, head2);


            System.out.print( "Final Sorted List: ");

            printList(newHead);
        }
    }

