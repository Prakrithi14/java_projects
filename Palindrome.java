import java.util.Scanner;
public class Palindrome {
    static boolean isPalindrome(String str1){
        int n=str1.length();
        for(int i=0;i<n;i++){
            if(str1.charAt(i)!=str1.charAt(n-1-i))    
                return false;
        }


        return true;
    }
    public static void  main(String args[]){
        String str1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        str1=sc.nextLine();
        isPalindrome(str1);
        if(isPalindrome(str1)){
            System.out.println("The given string "+str1+" is a palindrome");
        }
        else{
            System.out.println("The given string "+str1+" is not a palindrome");
        }



    }
}
