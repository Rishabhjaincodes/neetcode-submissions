class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int cnt=0;
        while(n>=0&&s.charAt(n)==' '){
            n--;
        }
        if(n==-1)return cnt;
        while(n>=0&&s.charAt(n)!=' '){
            n--;
            cnt++;
        }
        return cnt;
    }
}