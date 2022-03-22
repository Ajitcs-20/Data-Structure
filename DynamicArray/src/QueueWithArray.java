public class QueueWithArray {
    int front;
    int rear;
    int arr[];
        public QueueWithArray(int size)
        {
            arr=new int[size];
            int front=-1;
            int rear=-1;
        }
        public boolean isEmpty()
        {
            if(arr.length==front)
                return true;
            else
                return false;
        }
        public boolean isFull()
        {
            if(arr.length==rear)
                return true;
            else
                return false;
        }
        public void push(int n)
        {
            if(isFull())
            {
                System.out.println("Queue is full!!");
            }
            else if(isEmpty())
            {
                arr[rear]=n;
                System.out.println("Value inserted!!");
            }
            else
            {
                rear++;
                arr[rear]=n;
                System.out.println("Value insterted!!");
            }
        }
        public void pop()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty!!");
            }
           else if(arr[front]==0)
            {
                front++;
                arr[front]=0;
            }
            else
                arr[front]=0;
            front++;
        }
        public void print()
        {
            for (int i = 0; i <arr.length; i++) {
                System.out.println(arr[i]);
            }
        }


    public static void main(String[] args)
    {
      QueueWithArray Q=new QueueWithArray(4);
      Q.push(4);
      Q.push(7);
      Q.push(9);
      Q.pop();
      Q.pop();
      Q.print();

    }
}
