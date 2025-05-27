class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        // List<Integer> per=new ArrayList<>();
        permutations(0,ans,nums);
        return ans;

    }
    public static void permutations(int ind,List<List<Integer>> ans, int[] nums)
    {
        if(ind==nums.length)
        {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) perm.add(num);
            ans.add(perm);
            
            return;
        }
        for(int i=ind;i<nums.length;i++)
        {
          swap(nums,ind,i);
          permutations(ind+1,ans,nums);
          swap(nums,ind,i);  
            
        }
    }
public static void swap(int[] nums,int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}