import java.util.*;
public class Merge {
  static int[] merged(int arr[],int arr2[]){
    int p=arr.length;
    int q=arr2.length;
    int merge[]=new int[p+q];
    for(int i=0;i<p;i++){
        merge[i]=arr[i];
    }
    for(int j=0;j<q;j++){
        merge[j+p]=arr2[j];
    }
    return merge;

   }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        int n=arr.length;
        int m=arr2.length;  
      
        int result[]= merged(arr,arr2);
        
        Arrays.sort(result);
        System.out.println("Merged array:");
        for(int i=0;i<m+n;i++){
            System.out.print(+result[i]+" ");
        }
    }
    
}
