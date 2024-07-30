class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ans.add(generateR(i));
        }
        return ans;
    }
    public List<Integer> generateR(int i)
    {
        int ans= 1;
        List<Integer> row= new ArrayList<>();
        row.add(ans);
        for(int j=1;j<i;j++)
        {
            ans=ans*(i-j);
            ans=ans/j;
            row.add(ans);
        }
        return row;

    }
}