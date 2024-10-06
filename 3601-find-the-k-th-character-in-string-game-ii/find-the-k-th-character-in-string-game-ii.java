class Solution {
    public char kthCharacter(long k, int[] operations) {
        k-=1;
        return (char)(f(k,operations.length,operations)%26+'a');
    }
    public int f(long k,int idx,int a[])
    {
        if(idx==0)return 0;
        long fh=(long)Math.pow(2,idx-1);
        if(k>=fh)
        {
            if(a[idx-1]==0)
            {
                return f(k-fh,idx-1,a);
            }
            else{
                return f(k-fh,idx-1,a)+1;
            }
        }
        else{
            return f(k,idx-1,a);
        }
    }
}