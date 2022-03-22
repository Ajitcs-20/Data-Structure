import java.util.*;
public class Tree {
    public static void main(String[] args) {
        static Scanner sc=new Scanner(System.in);

    }


        public Node createTree(){
            Node root=null;
            System.out.println("Enter data: ");
            int data=sc.nextInt();
            if(data==-1) return null;
            root=new Node(data);
            System.out.println("Enter left ele: ");
            root.left=createTree();

            System.out.println("Enter left ele: ");
            root.right=createTree();

            return root;
        }


    }

private class Node{
    Node left, right;
    int data;
}
