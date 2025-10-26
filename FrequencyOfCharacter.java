import java.util.*;
public class FrequencyOfCharacter {
    static void check(String str,char ch){
        int count=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        if(count>0){
            System.out.println("Frequency of "+ch+" is "+count);
        }
        else{
            System.out.println("Character is not present in the string");
            }
        }

    
    public static void main(String[] args) {
        String str;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        System.out.println("Enter the character to check the frequency:");
         ch = sc.next().charAt(0);
        check(str,ch);
    }
}

