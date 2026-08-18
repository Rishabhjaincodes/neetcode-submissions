class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
             int sum=nums[i]+nums[left]+nums[right];
             if(sum>0){
                right--;
                continue;
             }
             if(sum<0){
                left++;
                continue;
             }
             if(sum==0){
                List<Integer> r=new ArrayList<>();
                r.add(nums[i]);
                r.add(nums[left]);
                r.add(nums[right]);
                if(!res.contains(r)){
                  res.add(r);
                }
             }
             left++;
             right--;
            }
        }
        return res;
    }
}
