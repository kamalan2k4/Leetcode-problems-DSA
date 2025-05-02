class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int t=a[i][j];
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=t;
            }
        }

    }
}