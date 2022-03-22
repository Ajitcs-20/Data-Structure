

public class Aray {
        int front;
        int rear;
        int arr[];
        public Aray(int arraysize)
        {
            arr=new int[arraysize];
            front=-1;
            rear=-1;
        }
        public boolean isEmpty(){
            if(rear==-1)
              return true;
            else
                return false;
        }
        public boolean isFull(){
            if(arr.length==rear)
                return true;
            else
                return false;
        }
        public void push(int value) {
            if (isFull()) {
                System.out.println("Aray is full");
            }
             else {
                rear++;
                arr[rear] = value;
                System.out.println("Value insterted: " + value);
            }
        }
        public void popFront(){
            if(isEmpty())
                System.out.println("Aray is Empty: ");
            else{
                front++;
                arr[front]=0;
                System.out.println("Value poped");
            }
        }
        public void show(){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }

