class Solution {
    public int trap(int[] hight) {
        int n=hight.length;
        int left=0;int right=n-1;
        int maxleft=0,maxright=0;
        int res=0;
        while(left<=right)
        {
            if(hight[left]<=hight[right])
            {
                if(hight[left]>=maxleft)
                maxleft=hight[left];
                else{
                    res+=maxleft-hight[left];
                }
                left++;

            }
            else
            {
                if(hight[right]>=maxright)
                {
                    maxright=hight[right];
                }
                else
                {
                    res+=maxright-hight[right];
                }
                right--;
            }
        }
        return res;
    }
}