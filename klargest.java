import java.util.*;
public class klargest {
     static List<Integer> klargestelements(int arr[],int k){
        Arrays.sort(arr);
        int  n=arr.length;
        List<Integer> result=new ArrayList<>();
        for(int i=n-1;i>=n-k;i--){
            result.add(arr[i]);
        }
        return result;
    }


    public static void main(String args[]){
        int arr[] = {12, 3, 5, 7, 19};
        int k = 3;
        List<Integer> res=klargestelements(arr,k);
        for(int nums:res){
            System.out.println(+nums+" ");
        }
        
    }
}
