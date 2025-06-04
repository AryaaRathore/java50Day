public class multiplication {
    public static void main(String[] args) {
        int[][] A={{1,2},{3,4}};
        int[][] B={{5,6},{7,8}};
        int[][] C=new int[2][2];// new array print  
        System.out.println("print A matix:");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println( );
        
    }
    System.out.println("print B matrix:");
    for(int i=0;i<B.length;i++){
        for(int j=0;j<B[i].length;j++){
            System.out.print(B[i][j]+" ");

        }
        System.out.println();
    }
    System.out.println("multiplication A and B:");
    for(int j=0;j<2;j++){
        for(int k=0;k<2;k++){
            C[j][k]=0;
            for(int l=0;l<2;l++){
                C[j][k]=C[j][k]+A[j][l]*B[l][k];

            }
            System.out.print(C[j][k]+" ");

        }   
        System.out.println();


    }


    
}
}