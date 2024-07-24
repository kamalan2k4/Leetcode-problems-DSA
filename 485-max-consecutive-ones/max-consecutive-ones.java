class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c1=0;
        int maxc=0;
        for(int i:nums)
        {
             if(i==1)
             c1++;
             else{
                maxc=Math.max(c1,maxc);
                c1=0;
             }
        }
        return Math.max(c1,maxc);
    }
}