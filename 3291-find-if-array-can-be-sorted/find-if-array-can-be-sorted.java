class Solution {
    public boolean canSortArray(int[] nums) {
        int prevmax=Integer.MIN_VALUE;
        int currmin=nums[0];
        int currmax=nums[0];
        int setbits=Integer.bitCount(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(setbits==Integer.bitCount(nums[i]))
            {
                currmax=Math.max(currmax,nums[i]);
                currmin=Math.min(currmin,nums[i]);
            }
            else{
                if(currmin<prevmax)
                return false;
                prevmax=currmax;
                currmax=nums[i];
                currmin=nums[i];
                setbits=Integer.bitCount(nums[i]);
            }
        }
        return currmin>prevmax;
    }
}