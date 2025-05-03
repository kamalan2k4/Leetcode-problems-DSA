class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==t)
                {
                   return true;
                }
            }
        }
        return false;
    }
}