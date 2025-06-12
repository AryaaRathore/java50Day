public class spiraltraverse {
    public static void main(String[] args) {   

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("spiral travese:");
        for(int i=0;i<=2;i++){
            System.out.print(arr[0][i]+" ");
            
              } 
              for(int i=1;i<=2;i++){
                System.out.print(arr[i][2]+" ");
              }

              for(int k=1;k>=0;k--){
                System.out.print(arr[2][k]+" ");
              }
             
             for(int i=0;i<=1;i++){
              System.out.print(arr[1][i]+" ");
             }
              
        
                
        }
        
    }
    

