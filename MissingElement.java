public class MissingElement {
  public static int  missing (int arr[]){
    int n=arr.length+1;
   
    for(int i=1;i<=n;i++){
         boolean found=false;
        for(int j=0;j<n-1;j++){
            if(arr[j]==i){
                found =true;
            }
        }
        if(!found){
            return i;
        }
    }
    return -1;
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7};
        int res=missing(arr);
        System.out.println("Missing element is"+res);
    }
}
