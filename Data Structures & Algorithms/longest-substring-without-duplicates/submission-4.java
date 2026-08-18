class Solution {
    public int lengthOfLongestSubstring(String s) {

        int res = 0;
        int left = 0;

        HashSet<Character> l = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            while (l.contains(s.charAt(i))) {
                l.remove(s.charAt(left));
                left++;
            }

            l.add(s.charAt(i));

            res = Math.max(res, l.size());
        }

        return res;
    }
}