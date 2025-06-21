public class setentire {
    public static void rowandcolum(int[][] matrix){
      int n=matrix.length;
      int m=matrix[0].length;

      boolean[] rows=new boolean[n];
       boolean[] cols=new boolean[m];

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                rows[i]=true;
                cols[j]=true;
            }
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(rows[i]||cols[j]){
                matrix[i][j]=0;
            }

        }
    }
    }
    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,0,2},{1,3,1,5}};
        rowandcolum(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
