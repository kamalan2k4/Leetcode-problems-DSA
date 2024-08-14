class Solution {
    public int maxDepth(String s) {
        int max=0;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            sum++;
            else if(s.charAt(i)==')')
            {
            if(sum>max)
                max=sum;
                sum--;
            }
        }
        return max;
    }
}