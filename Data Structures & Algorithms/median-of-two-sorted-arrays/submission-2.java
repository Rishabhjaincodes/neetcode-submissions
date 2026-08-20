class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int[] temp = new int[n/2+1];
        int i = 0;
        int j = 0;

        for(int k=0; k<temp.length; k++){
            if(i < n1 && j < n2){
                if(nums1[i] < nums2[j]){
                    temp[k] = nums1[i];
                    i++;
                }else {
                    temp[k] = nums2[j];
                    j++;
                }
            }else if(i < n1){
                temp[k] = nums1[i];
                i++;
            }else{
                temp[k] = nums2[j];
                j++;
            }
        }

        int t = temp.length; 
        if(n%2 == 0){
            return (temp[t-1] + temp[t-2])/2.0; 
        }else{
            return (double)temp[t-1];
        }
    }
}
