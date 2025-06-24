public class rainwater {
    public int trap(int[] height){
        if(height==null||height.length<2){
            return 0;
        }
        int n=height.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
            rightmax[n-1]=height[n-1];
            for(int j=n-2;j>=0;j--){
                rightmax[i]=Math.max(rightmax[i+1],height[i]);
            }
            int trappedwater=0;
            for(int k=0;k<n;k++){
                trappedwater+=Math.min(leftmax[i],rightmax[i])-height[i];
            }
            return trappedwater;
        }
        return n;
        
    }
    public static void main(String[] args) {
        rainwater solver=new rainwater();
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped water:"+solver.trap(height));
    }
    
}
