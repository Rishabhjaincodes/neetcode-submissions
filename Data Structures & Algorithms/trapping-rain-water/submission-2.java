class Solution {
    public int trap(int[] height) {
       int[] leftMax=new int[height.length];
       int[] rightMax=new int[height.length];
       int max=0;
       for(int i=0;i<height.length;i++){
        leftMax[i]=max;
        max=Math.max(height[i],max);
       }
       max=0;
       for(int i=height.length-1;i>=0;i--){
        rightMax[i]=max;
        max=Math.max(height[i],max);
       }
       int sum=0;
       for(int i=1;i<height.length-1;i++){
        int ans=Math.min(leftMax[i],rightMax[i])-height[i];
        if(ans>0){
            sum+=ans;
        }
       }
       return sum;
    }
}
