public class StackwithArray {
    int arr[];
    int top;

    public StackwithArray(int arraysize) {
        arr = new int[arraysize];
        int top = -1;
    }

    public boolean IsEmpty() {
        if (top == -1)
            return true;
        else
            return false;

    }

    public boolean IsFull() {
        if (top == arr.length - 1)
            return true;
        else
            return false;
    }

    public void Push(int value) {
        if (IsFull()) {
            System.out.println("Stack is full !!");
        } else if (IsEmpty()) {
            arr[top] = value;
            System.out.println("value inserted ");
        }
        else{
            top++;
            arr[top] = value;
            System.out.println("value inserted ");
        }

    }

    public void pop() {
        if (IsEmpty()) {
            System.out.println("stack is Empty !!");
        } else {

            System.out.println("poped:");
            arr[top] = 0;
            top--;
        }
    }
        public void Display()
        {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

