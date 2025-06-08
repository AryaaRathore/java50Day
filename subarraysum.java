public class subarraysum {
    
 static int maximum_subarray(int[] arr) {
        
        if(arr.length==0){
        
            return 0;
        }
            int currentmax=arr[0];
            int max=arr[0];
            
        

            for(int i=1;i<arr.length;i++){
                currentmax=Math.max(arr[i],currentmax+arr[i]);
                max=Math.max(max, currentmax);
            }
            return max;
        }
    
    public static void main(String[] args) {
        int[] arr={-2,-3,1,4,-1,2,4};
       int maxsum= maximum_subarray(arr);
        System.out.println("maximum subarray sum="+maxsum);
    }
    
}

    

