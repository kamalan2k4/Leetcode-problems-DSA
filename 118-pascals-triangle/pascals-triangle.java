class Solution {
    public List<List<Integer>> generate(int n) {
        int ans=1;
        List<List<Integer>> result =new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
           result.add(genrow(i));
        }
        return result;
    }
    public static List<Integer> genrow( int row)
    {
        int ans=1;
        List<Integer> res=new ArrayList<>();
        res.add(ans);
        for(int i=1;i<row;i++)
        {
            ans=ans*(row-i);
            ans=ans/i;
            res.add(ans);
        }
        return res;
    }
}