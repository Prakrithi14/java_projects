import java.util.Scanner;

public class SimpleInterest{
    public static void main(String args[]){
        float p,r,t;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principal amount:");
        p=sc.nextFloat();
        System.out.println("Enter rate of interest:");
        r=sc.nextFloat();
        System.out.println("Enter time:");
        t=sc.nextFloat();
        float SI=(p*r*t)/100;
        System.out.println("Simple Interest is:"+SI);
    }
}