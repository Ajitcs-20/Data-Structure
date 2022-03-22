public class fact {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
    public static int fac(int valu){
        if(valu==0) {
            return 1;
        }

            int fn=fac(valu-1);
            return fn*valu;

    }
}
