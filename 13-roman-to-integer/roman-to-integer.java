class Solution {
    public int romanToInt(String s) {
        int number=0;
        int ans=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='I')
            {
            number=1;
            // break;
            }
           else if(s.charAt(i)=='V')
            {
            number=5;
            // break;
            }
            else if(s.charAt(i)=='X')
            {
            number=10;
            // break;
            }
            else if(s.charAt(i)=='L')
            {
            number=50;
            // break;
            }
            else if(s.charAt(i)=='C')
            {
            number=100;
            // break;
            }
            else if(s.charAt(i)=='D')
            {
            number=500;
            // break;
            }
            else if(s.charAt(i)=='M')
            {
            number=1000;
            // break;
            }
            if(4*number<ans)
            ans-=number;
            else
            ans+=number;
        }
        return ans;
    }
}