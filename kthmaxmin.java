import java.util.Arrays;
import java.util.Collections;
public class kthmaxmin {
   public static void kth_large_small(int[] arr,int k){
    Arrays.sort(arr);
    int n=arr.length;
    System.out.println( "kth largest element "+arr[n-1]+" "+"kth smallest element "+arr[k-1]+" ");
    

    
   }
   public static void main(String[] args) {
    int[] arr={12,3,5,10,9};
    int k=2;
    
    kth_large_small(arr, k);
   }
    
   } 

