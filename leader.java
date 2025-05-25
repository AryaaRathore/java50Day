public class leader {
    public static void main(String[] args) {
        int[] arr={16,17,8,3,4,2,1};
        int max=arr[arr.length-1];//right to left
        System.out.println("leader in an array:");
        System.out.print(max+" ");
        for(int i=arr.length-1;i>=0;i--){
    
            if(arr[i]>max){
                max=arr[i];
        System.out.print(max+" ");
        }
    }
        
    }
    
}
