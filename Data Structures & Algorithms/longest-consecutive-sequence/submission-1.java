class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> h=new HashSet<>();
        for(int num: nums){
            h.add(num);
        }
        int max=0;
        for(int num: h){
            if(!h.contains(num-1)){
                int curr=num;
                int count=1;
                while(h.contains(curr+1)){
                    curr++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}