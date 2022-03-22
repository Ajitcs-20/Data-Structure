
import java.util.*;
public class date {
    public static void main(String[] args) {
        Date now=new Date();
        Scanner obj=new Scanner(System.in);
        System.out.println("enter name: ");
        Scanner num=new Scanner(System.in);
        System.out.println("enter array: ");
        int n;
        n=num.nextInt();
        int[] array=new int[10];
        for (int i=0;i<=10;i++){
            array[i]= num.nextInt();
        }
        System.out.println("array elements are: ");
        for (int i=0;i<=10;i++){
            System.out.println(array[i]);
        }
        //System.out.println(arr);

        String name=obj.nextLine();
        System.out.println(name);
        System.out.println(now);
    }
}