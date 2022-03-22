public class QueuewithArrayMain {
    public static void main(String[] args) {
        QueuewithArray qwa=new QueuewithArray(5);
        qwa.push(2);
        qwa.push(3);
        qwa.push(4);
        qwa.push(5);
        qwa.pop();
        qwa.pop();
        qwa.pop();
        qwa.Display();
    }
}
