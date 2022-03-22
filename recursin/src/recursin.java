public class recursin {
    public static void main(String[] args) {
        dec(5);
    }
        public static int dec(int value){
            if(value==0)
                return -1;
            else
            {
                System.out.println(value);

            }
            return dec(value-1);
        }

}
