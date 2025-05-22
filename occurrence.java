public class occurrence {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,1,2,1,3,8,1};
        int count=0;
        int found=1;
        for(int i=0;i<arr.length;i++){
        
           if(found==arr[i]){
            arr[i]++;
            count++;
           }
        }
        System.out.println("found value:" + found + ",count value:" + count);
    }
    
}
