class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++){
            
            
            left[i]=max;
            max=Math.max(height[i],max);
        }
        max=0;
        for(int i=height.length-1;i>=0;i--){
            
           
            right[i]=max;
             max=Math.max(height[i],max);
        }
        int sum=0;
        for(int i=1;i<height.length-1;i++){
            int ans=Math.min(right[i],left[i])-height[i];
            if(ans>0){
                sum+=ans;
            }
        }
        return sum;
    }
}
