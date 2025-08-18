public class Invertedalphabet {
    
    public static void main(String args[]){
        int n=5,i,j;
        char c='A';
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }

    }
}
