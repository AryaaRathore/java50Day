public class merge {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr1={6,7,8,9,0}; 
        int[] merged=new int[arr.length+arr1.length];
         
         for(int i=0;i<arr.length;i++){
            merged[i]=arr[i];
         }
         for(int i=0;i<arr1.length;i++){
            merged[arr1.length+i]=arr1[i];
            
         }
         System.out.println("merged array:");
         for(int val: merged){
            System.out.print(val+" ");
         }

    }
    
}



    

