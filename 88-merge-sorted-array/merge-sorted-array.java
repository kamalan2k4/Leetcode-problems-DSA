class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=n-1;
        int mergeIndex=m+n-1;
        // int s=Math.min(n,m);
       while (right >= 0) {
            if (left>=0 && nums1[left] > nums2[right]) {
                nums1[mergeIndex] = nums1[left];
                left--;
            } else {
                nums1[mergeIndex] = nums2[right];
                right--;
            }
            mergeIndex--;
        }
        
    }
}