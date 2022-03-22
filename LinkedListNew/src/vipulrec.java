public class vipulrec {
    public static void main(String[] args) {
        int result=fun(5,10);
        System.out.println(result);
    }
    public static int fun(int start, int end )
    {
        if(end<start)
        {
            return 0;
        }
        else
        {
            return start+fun(end,start+1);
        }
    }

}
