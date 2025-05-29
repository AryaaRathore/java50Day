import java.util.HashSet;

public class intersectionUnion {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                
                set.add(arr2[j]);
            }
            set.add(arr1[i]);  
        }
        System.out.println("union of two array"+set);
        System.out.println("intersection of two array:");
        for(int k=0;k<arr1.length;k++){
            for(int l=0;l<arr2.length;l++){
                if(arr1[k]==arr2[l]){
                    System.out.print( arr1[k]+" ");
                    break;
                }
            }
        }
        
    }
}