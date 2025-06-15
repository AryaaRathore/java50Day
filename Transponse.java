import java.util.Arrays;

public class Transponse {
    public static void transponse(int[][] matrix,int[][]res) {

        int row=matrix.length;
        int colum=matrix[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                res[j][i]=matrix[i][j];
                
            }
        
        }


    }
    public static void main(String[] args) {                                             
        int[][] matrix={{1,2,3},{4,5,6}};
        int[][] res=new int[matrix[0].length][matrix.length];
        transponse(matrix, res);
        System.out.println("transponse matrix is:");
        for(int[] row:res){
            System.out.println(Arrays.toString(row));
        }
    }
}
