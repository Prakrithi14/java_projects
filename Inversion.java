public class Inversion {
    static int countInversions(int arr[]){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
   public static void main(String args[]){
    int arr[]={4,3,2,1};
    System.out.println("Number of inversions are: " + countInversions(arr));
   } 
}
