class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums=new int[m+n];
        int x=m+n;
        int i=0;
        int j=0;
        int k=0;
        while(x>0&&i<m&&j<n){
         
          if(nums1[i]<=nums2[j]){
            nums[k]=nums1[i];
            i++;
            k++;
          }else{
            nums[k]=nums2[j];
            j++;
            k++;
          }
          x--;
        }
        if(i==m&&j!=n){
         while(j<n){
            nums[k]=nums2[j];
            j++;
            k++;
         }
        }else if(j==n&&i!=m){
            while(i<m){
            nums[k]=nums1[i];
            i++;
            k++;
         }
        }
        x=m+n;
        int y=(x-1)/2;
        if(x%2==0){
            return (nums[y]+nums[y+1])/2.0;

        }
        return nums[y]/1.0;
    }
}
