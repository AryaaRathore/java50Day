public class pairs {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,6,-1,7,1};
        int target=6;
        System.out.println("two pairs sum "+target);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
            }
        }
        }
    
        }
    
