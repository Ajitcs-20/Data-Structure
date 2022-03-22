public class TowerOfhanoi {
    public static void movedisc(int n, char rod1,char rod2,char rod3)
    {
        if(n==1)
        {
            System.out.println("Move disc from "+rod1+" to"+rod3);
        }
        movedisc(n-1,rod1,rod3,rod2);
        System.out.println("move disc "+n+" from rod "+rod1+" to rod "+rod3);
        movedisc(n-1,rod3,rod2,rod1);

    }

    public static void main(String[] args) {
        int n=4;
        movedisc(n,'A','B','C');
    }
}
