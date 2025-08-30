import java.util.Scanner;

public class substring {
    public static void main(String args[]){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        s=sc.nextLine();
        String sub=s.substring(0,5);
        System.out.println("Original string is "+s);
        System.out.println("Substring is "+sub);
    }
}
