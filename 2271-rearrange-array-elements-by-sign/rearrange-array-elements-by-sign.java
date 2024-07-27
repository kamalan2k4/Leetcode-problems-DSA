class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[]=new int[nums.length];
        int n=1,p=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                arr[p]=nums[i];
                p=p+2;
            }
            else
            {
                arr[n]=nums[i];
                n=n+2;
            }
        }
        return arr;
    }
}