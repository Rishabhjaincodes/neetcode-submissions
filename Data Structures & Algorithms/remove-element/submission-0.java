class Solution {
    public int removeElement(int[] nums, int val) {
        int left=nums.length-1;
        
        for(int i=0;i<nums.length;i++){
             while(left>=0 && nums[left]==val){
              left--;
              
             }
             if(left==-1)break;
             if(left<=i)break;
             if(nums[i]==val){
                int tmp=nums[i];
                nums[i]=nums[left];
                nums[left]=tmp;
                left--;
             }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                return i;
            }
        }
        return nums.length;
        
    
    }
}