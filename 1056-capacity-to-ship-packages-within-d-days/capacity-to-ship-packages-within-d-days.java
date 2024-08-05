class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            maxi=Math.max(maxi,weights[i]);
            sum+=weights[i];
        }
        int l=maxi,h=sum;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(findDays(weights,mid)<=days)
            {
                h=mid-1;
            }
            else
            l=mid+1;
        }
        return l;
    }
    public static int findDays(int[] weights,int c)
    {
         int days=1;
         int load=0;
         int n=weights.length;
         for(int i=0;i<n;i++)
         {
            if(load+weights[i]>c)
            {
                days++;
                load=weights[i];

            }
            else
            {
                load+=weights[i];
            }
         }
         
         return days;
    }
}