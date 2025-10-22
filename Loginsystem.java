import java.util.Scanner;
public class Loginsystem{
    public static void main(String args[]){
        final String username="admin";
        final String password="admin123";
        final int maxattempt=3;
        int currentattempt=0;
        Scanner sc=new Scanner(System.in);
        boolean loggedin=false;
       while(currentattempt<maxattempt && !loggedin){
            System.out.println("Enter username:");
            String user=sc.nextLine();
            System.out.println("Enter password:");
            String pass=sc.nextLine();
            if(user.equals(username) && pass.equals(password)){
                loggedin=true;
                System.out.println("Login successful");
            }else{
                System.out.println("Invalid credentials .Try again");
                currentattempt++;
            if(currentattempt==maxattempt){
                System.out.println("Blocked");
            }
        }
    }
    sc.close();

    }
}