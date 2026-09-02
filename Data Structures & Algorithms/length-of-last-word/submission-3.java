class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int cnt=0;
        while(n>=0&&s.charAt(n)==' '){
            n--;
        }
        
        while(n>=0&&s.charAt(n)!=' '){
            n--;
            cnt++;
        }
        return cnt;
    }
}