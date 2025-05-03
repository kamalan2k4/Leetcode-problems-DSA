class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int low=0;
        int high=a.length*a[0].length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int row=mid/a[0].length;
            int col=mid%a[0].length;
            if(a[row][col]==t)
            return true;
            else if(a[row][col]<t)
            low=mid+1;
            else
            high=mid-1;

        }
        return false;
    }
}