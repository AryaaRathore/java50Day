public class rowandcolum {
    public static boolean matsearch(int[][] matrix,int x){
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==x){
                  return true;
                }
            }
        }
        return false;
        

        
    }
    public static void main(String[] args) {
        int[][] matrix={{3,30,39},{20,45,34},{35,60,67}};
        int x=35;
        if(matsearch(matrix, x)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
