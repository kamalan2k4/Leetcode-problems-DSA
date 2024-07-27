class Solution {
    public int longestConsecutive(int[] nums) {
    //    Arrays.sort(nums);
    if (nums == null || nums.length == 0) {
            return 0;
        }
    //    int c=0;
    Set<Integer> s=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        s.add(nums[i]);
       } 
       int maxi=0;
       for(int i:s)
       {
        if(!s.contains(i-1))
        {
            int c=1;
            int x=i;
            while (s.contains(x+1))
            {
                x++;
                c++;
            }
                maxi=Math.max(maxi,c);
        }
       }
       return maxi;
    }
}