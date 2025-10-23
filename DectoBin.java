import java.util.*;
public class DectoBin {
    static void decimaltobinary(int n){
        int binary[]=new int[100];
        int i=0;
        while(n>0){
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        n=sc.nextInt();
        decimaltobinary(n);

    }
    
}
