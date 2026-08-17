class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        // 3. Put numbers into their frequency bucket
        for (int num : map.keySet()) {

            int freq = map.get(num);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // 4. Go from highest frequency to lowest
        int[] result = new int[k];
        int index = 0;

        for (int freq = bucket.length - 1;
             freq >= 0 && index < k;
             freq--) {

            if (bucket[freq] != null) {

                for (int num : bucket[freq]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
