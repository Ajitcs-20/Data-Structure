public class SumofNum {
    public static void main(String[] args) {
        System.out.println(addnum(5));
    }
     static int addnum( int n){
        if (n == 1)
            return 1;
        else
            return addnum(n - 1) + n;
    }
}
