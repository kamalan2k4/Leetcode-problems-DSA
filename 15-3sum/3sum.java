class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ar=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]==0)
                {
            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
            ar.add(temp);
            j++;
            while(nums[j]==nums[j-1] && j<k)
            j++;
                }
                else if(nums[i]+nums[j]+nums[k]>0)
                k--;
                else
                j++;
            }
        }
        return ar;
    }
}