public class Matrixgravity {
    public static void gravity(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<m;i++){
            int countbrick=0;
            for(int j=0;j<n;j++){
                if(matrix[j][i]==1){
                    countbrick++;
                }
            }
            for(int j=n-1;j>=0;j--){
                if(countbrick>0){
                   
                    matrix[j][i]=1;
                     countbrick--;
                }
                else
                    matrix[j][i]=0;
            }
            
        }

    }
    public static void print(int[][] matrix){
        for(int row[]:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();

            
        }
    }
    public static void main(String args[]){
        int matrix[][]={ {1, 0, 1}, {0, 1, 0}, {0, 0, 0}};
        print(matrix);
        gravity(matrix);
        System.out.println("After gravity:");
        print(matrix);
    }
    
}
