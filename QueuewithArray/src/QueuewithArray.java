public class QueuewithArray {
    int arr[];
    int front;
    int rear;
    public QueuewithArray(int arraysize)
    {
        arr=new int[arraysize];
        int front =-1;
        int rear=-1;
    }
    public boolean IsEmpty()
    {
        if(rear==-1)
            return true;
        else
            return false;
    }
    public boolean IsFull()
    {
        if(arr.length==rear)
            return true;
        else
            return false;
    }
    public void push(int value)
    {
        if(IsFull())
        {
            System.out.println("queue is full !!");
        }
        else if (IsEmpty())
        {
            arr[rear] = value;
            System.out.println("value inserted");
    }
         else {
            rear++;
            arr[rear] = value;
            System.out.println("value inserted");
        }
    }
    public void pop() {
        if (IsEmpty()) {
            System.out.println("queue is empty !!");
        } else {
            arr[front] = 0;
            front++;
        }
    }
    public void Display()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
