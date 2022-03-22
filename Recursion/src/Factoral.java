public class Factoral {
    public static void main(String[] args) {
        System.out.println(fact(4));
    }
    static int fact(int x)
    {
        if(x==1)
            return 1;
        return fact(x-1)*x;
    }
}
