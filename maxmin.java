public class maxmin{
    public static void main(String[] args) {
        int[] arr={3,8,1,10,14};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum "+max);
        System.out.println("minimum "+min);
        
    }
}