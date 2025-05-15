public class negative {
    public static void main(String[] args) {
        int[] arr={-1,4,9,-2,1,-3};
        int n=arr.length;
        int temp,j=0;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
