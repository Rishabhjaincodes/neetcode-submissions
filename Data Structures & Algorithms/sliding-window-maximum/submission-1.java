class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0;
        int[] maxi=new int[nums.length-k+1];
        int idx=0;
        Deque<Integer> a=new ArrayDeque<>();
        for(int r=0;r<nums.length;r++){
            while(!a.isEmpty() && nums[a.peekLast()] < nums[r]) {
                a.removeLast();
            }
            a.addLast(r);
            int win=r-l+1;
            if(win==k){
                if(a.peekFirst() < l) {
                    a.removeFirst();
                }
                maxi[idx]=nums[a.peekFirst()];
                idx++;
                l++;
            }
        }
        return maxi;
    }
}