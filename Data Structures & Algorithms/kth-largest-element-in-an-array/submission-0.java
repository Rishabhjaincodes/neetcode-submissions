class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int num: nums){
            p.offer(num);
        }
        for(int i=1;i<=nums.length-k;i++){
            p.poll();
        }
        return p.poll();
    }
}
