public class Factorial {
    public static void main(String args[]) {
        int n,i;
        int res=1;
        n=5;
        for(i=2;i<=n;i++){
            res=res*i;
        }
        System.out.println("Factorial of " + n + " is: " + res);
    }
    
}
