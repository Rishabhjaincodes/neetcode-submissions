class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a=new int[nums.length];
        int k=1;
        for(int i=0;i<nums.length;i++){
            a[i]=k;
            k*=nums[i];
        }
        k=1;
        for(int i=nums.length-1;i>=0;i--){
            a[i]*=k;
            k*=nums[i];
        }
        return a;
    }
}  
