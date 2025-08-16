public class Equilibrium {
    static int equilib(int[] arr){
        for(int i=0;i<arr.length;i++){
            int leftSum = 0;
            int rightSum = 0;

            for(int j=0;j<i;j++){
                leftSum += arr[j];
            }
            for(int k=i+1;k<arr.length;k++){
                rightSum += arr[k];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1; // No equilibrium index found

    }
    

    public static void main(String args[]){
        int[] arr = {1, 3, 5, 2, 2};
        int n=arr.length;
        int res=equilib(arr);
        System.out.println(res);
    }
}
