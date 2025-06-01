public class subarray {
 static void maximum_subarray(int[] arr) {
        
        if(arr==null||arr.length==0){
            System.out.println(0);
            return;
        }
            int maxproduct=arr[0];
            int minproduct=arr[0];
            int result=arr[0];
        

            for(int i=1;i<arr.length;i++){
                int c=arr[i];

                if(c<0){
                    int temp=maxproduct;
                    maxproduct=minproduct;
                    minproduct=temp;
                }
                maxproduct=Math.max(c, maxproduct*c);
                minproduct=Math.min(c, minproduct*c);

                result=Math.max(result,maxproduct);
            }
            System.out.println("maximum subarray of product " +result);
        
    }

    
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        maximum_subarray(arr);
    }
    
}
