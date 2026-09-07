class Solution {

    public boolean isHappy(int n) {
       HashSet<Integer> set=new HashSet<>();
       
       while(n!=1){
          int k=n;
          int sum=0;
          while(k!=0){
            int rem=k%10;
            sum+=(rem*rem);
            k/=10;
          }
          if(set.contains(sum)){
            return false;
          }
          set.add(sum);
          n=sum;
       }
       return true;
    }
}
