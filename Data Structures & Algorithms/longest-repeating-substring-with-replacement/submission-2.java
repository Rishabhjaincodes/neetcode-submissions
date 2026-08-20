class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int max=1;
        int res=1;
        HashMap<Character,Integer> freq=new HashMap<>();
        int windowsize=0;
        for(int r=0;r<s.length();r++){
          freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0)+1);
          max=Math.max(max,freq.get(s.charAt(r)));
          int win=r-l+1;
          if((win-max)<=k){
            res=Math.max(res,win);
          }else{
            freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
            l++;
          }
        }
        return res;
    }
}
