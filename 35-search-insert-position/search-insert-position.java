class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1,ans=nums.length;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>=target)
            {ans= mid;
          
            r=mid-1;
            }
            else
            l=mid+1;
        }
        return ans;
    }
}