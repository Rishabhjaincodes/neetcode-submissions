

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freq = new int[26];
        int[] window = new int[26];

       
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        int k = s1.length();
        int l = 0;

        for (int r = 0; r < s2.length(); r++) {

            
            window[s2.charAt(r) - 'a']++;

            int win = r - l + 1;

            
            if (win == k) {

                
                if (Arrays.equals(freq, window)) {
                    return true;
                }

                
                window[s2.charAt(l) - 'a']--;
                l++;
            }
        }

        return false;
    }
}
