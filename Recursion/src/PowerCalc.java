public class PowerCalc {
    public static void main(String[] args) {
        System.out.println(pow(2,2));
    }
    static int pow(int z,int y)
    {
        if(y==0)
            return 1;
        if(y%2==0)
            return pow(z*z,y/2);
        else
          return z*pow(z*z,(y-1)/2);
    }
}
