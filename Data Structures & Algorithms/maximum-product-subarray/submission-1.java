class Solution {
    public int maxProduct(int[] nums) {

        int maxEnding = nums[0];
        int minEnding = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int currentMax = Math.max(nums[i],
                    Math.max(nums[i] * maxEnding,
                             nums[i] * minEnding));

            int currentMin = Math.min(nums[i],
                    Math.min(nums[i] * maxEnding,
                             nums[i] * minEnding));

            maxEnding = currentMax;
            minEnding = currentMin;

            answer = Math.max(answer, maxEnding);
        }

        return answer;
    }
}
