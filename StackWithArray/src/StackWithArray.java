

public class StackWithArray {
    public static void main(String[] args) {
        StackMain swa=new StackMain(5);
        swa.push(6);
        swa.push(4);
        swa.push(5);
        swa.show();
        swa.pop();
        swa.show();
        swa.push(9);
        swa.show();
        swa.push(5);
        swa.pop();
        swa.show();

    }
}
