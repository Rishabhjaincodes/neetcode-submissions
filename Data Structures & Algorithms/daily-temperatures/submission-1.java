class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int[] res=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            int curr=temperatures[i];
            while(!s.isEmpty()&& curr>=temperatures[s.peek()]){
              s.pop();
            }
            if(s.isEmpty()){
              res[i]=0;
            }else{
                res[i]=s.peek()-i;
            }
            s.push(i);
        }
        return res;
    }
}
