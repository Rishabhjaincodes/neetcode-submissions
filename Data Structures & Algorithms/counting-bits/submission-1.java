class Solution {
    public int[] countBits(int n) {
        int[] output=new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            int k=i;
            while(k!=0){
                k=k&(k-1);
                c++;
            }
            output[i]=c;
        }
        return output;
    }
}
