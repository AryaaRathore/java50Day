public class rotatedegree {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int[][] rotatematrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotatematrix[j][n-1-i]=matrix[i][j];
            }
        }
        System.out.println("original matrix:");
        printMatrix(matrix);
        System.out.println("\nRotated matrix (90 degree clockwise):");
        printMatrix(rotatematrix);
    

        }
    

    private static void printMatrix(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
