public class diagonal {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
           for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );

        }


        System.out.println("original diagonal:");
        for(int i=0;i<matrix.length;i++){
            System.out.println(matrix[i][i]+" ");

        }
        System.out.println("second diagonal:");
        for(int i=0;i<matrix.length;i++){
            System.out.println(matrix[i][matrix.length-1-i]+" ");
        }
    }
    
}
