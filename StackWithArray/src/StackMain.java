public class StackMain {
    int top;
    int[] arr;
    public StackMain(int size){
        arr=new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(top==arr.length-1)
            return true;
        else
            return false;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else
            top++;
        arr[top]=value;
        System.out.println("Value inserted: "+value);
    }
    public void pop(){
        if(isEmpty())
            System.out.println("stack is Empty!! ");
        else {
            arr[top] = 0;
            top--;
            System.out.println("Value Poped");
        }

    }
    public void show(){
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
