class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max=0;
       for(int num: piles){
        max=Math.max(max,num);
       }
       int left=1;
       int right=max;
       int k=0;
       while(left<=right){
        int mid=left+(right-left)/2;
        int hr=0;
        //important to get ceil division
        for(int pile: piles){
            hr+=(pile+mid-1)/mid;
        }
        
        if(hr<=h){
            right=mid-1;
            k=mid;
        }
        if(hr>h){
            left=mid+1;
          
        }
       }
       return k;
    }
}
