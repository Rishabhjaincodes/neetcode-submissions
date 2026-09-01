class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int v1=s.charAt(i);
            int v2=s.charAt(i+1);
            sum+=Math.abs(v2-v1);
        }
        return sum;
    }
}