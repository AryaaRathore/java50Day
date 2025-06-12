public class boundaryTraverse {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
          System.out.println("boundary traverse:");
          for(int i=0;i<=2;i++){
            System.out.print(arr[0][i]+" ");
          }
          for(int i=1;i<=2;i++){
            System.out.print(arr[i][2]+" ");
          }
          for(int i=1;i>=0;i--){
            System.out.print(arr[2][i]+" ");
          }
          for(int i=0;i<=0;i++){
            System.out.print(arr[1][i]+" ");
          }
    }
    
}
