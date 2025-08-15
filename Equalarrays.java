import java.util.*;
class Equalarrays{
        static boolean checkequal(int[] arr1,int[] arr2){
            if(arr1.length!=arr2.length){
                return false;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i=0;i<arr1.length;i++)
                if(arr1[i]!=arr2[i])
                    return false;
                return true;
            

          
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
       
             System.out.println("enter 1");
             for(int i=0;i<n;i++){
                 arr1[i]=sc.nextInt();
             }
             System.out.println("enter 2");
            for(int i=0;i<n;i++){
                 arr2[i]=sc.nextInt();
             }
             if(checkequal(arr1,arr2)){
            System.out.println("True");
             }
            else{
            System.out.println("False");
        }
    }
}