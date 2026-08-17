class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String f : strs) {

            int[] a = new int[26];

            for (char c : f.toCharArray()) {
                a[c - 'a']++;
            }

            String key = Arrays.toString(a);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(f);
        }

        return new ArrayList<>(map.values());
    }
}
