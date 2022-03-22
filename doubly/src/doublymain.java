public class doublymain {
    public static void main(String[] args) {


            doubly.Node head1 = null, head2 = null;

            head1 = insert(head1, 8);

            head1 = insert(head1, 5);

            head1 = insert(head1, 3);

            head1 = insert(head1, 1);


            head2 = insert(head2, 11);

            head2 = insert(head2, 9);

            head2 = doubly.insert(head2, 7);

            head2 = doubly.insert(head2, 2);


            doubly.Node newHead = mergeUtil(head1, head2);


            System.out.print( "Final Sorted List: ");

        }
    }



