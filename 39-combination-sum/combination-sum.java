class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findcombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public static void findcombinations(int ind,int[] cand, int target, List<List<Integer>> ans, List<Integer> ds)
    {
        if(ind==cand.length)
        {
            if(target==0)
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(cand[ind]<=target)
        {
            ds.add(cand[ind]);
            findcombinations(ind,cand,target-cand[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcombinations(ind+1,cand,target,ans,ds);
    }
}