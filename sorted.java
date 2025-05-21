public class sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int i=0;
        int lastvalue=arr[arr.length-1];
            if(arr[i]<arr[i+1]){
                System.out.println("array is sorted");
            }
            else if(arr[0]==lastvalue){
                System.out.println("array is rotated");
            }
    
        }
    }
    
    

