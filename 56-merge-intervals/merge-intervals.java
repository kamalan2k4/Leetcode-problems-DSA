class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a,(x,y)-> x[0]-y[0]);
        
        List<int[]> ans=new ArrayList<>();
        ans.add(a[0]);
        for(int i=1;i<a.length;i++)
        {
            if(a[i][0] > ans.get(ans.size()-1)[1])
            ans.add(a[i]);
            else
            ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],a[i][1]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}