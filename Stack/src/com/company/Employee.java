package com.company;

public class Employee {
    String name;
    int id;
    int sal;

    public Employee(String name, int id, int sal) {

        System.out.println(name+"  "+id+"  "+sal);
    }
}// end of the employee class
    class Node
    {
        Employee data;
        Node next;
        public Node(Employee data)
        {
            this.data=data;
            next=null;
        }
    }//end of the node class
class QueueByLinkedList
{
    Node head;
    Node tail;
    public QueueByLinkedList()
    {
        head=null;
        tail=null;
    }
    public void enqueue(Employee value)
    {
        Node newnode=new Node(value);
        if(tail==null)
        {
            tail=head=newnode;
        }
        else
        {
            tail.next=newnode;
        }
    }
    public void dequeue()
    {
        if(head==null){
            System.out.println("it is empty");
        }
        else
            {
            head=head.next;
        }
    }
}//end of queue byb LinkedList
class QueueByLinkedMain
{
    public static void main(String args[])
    {
        Employee obj=new Employee("abs",123,10000);
        QueueByLinkedList lobj=new QueueByLinkedList();
        lobj.enqueue(obj);
        Employee obj1=new Employee("ajit",132,30000);
        lobj.enqueue(obj1);

    }
}
