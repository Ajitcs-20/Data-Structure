public class recr {
    public static void main(String[] args) {
 inc(5);
    }
    public static void inc(int val){
        if(val==0)
            return ;
        else {
            inc(val - 1);
            System.out.println(val);
        }
    }
}
