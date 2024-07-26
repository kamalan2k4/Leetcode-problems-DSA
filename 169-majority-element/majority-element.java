class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        Arrays.sort(nums);
        int maxc=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
               maxc=Math.max(maxc,c);
               if(maxc>nums.length/2)
               return nums[i];
               c=1;
             }
            else
            c++;
        }
        return nums[nums.length-1];
    }
}