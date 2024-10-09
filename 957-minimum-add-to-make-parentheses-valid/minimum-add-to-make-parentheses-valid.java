class Solution {
    public int minAddToMakeValid(String s) {
        int c=0;
        int op=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            op++;
            else if(s.charAt(i)==')')
            {
                if(op>0)
                {
                op--;
                
                }
                else
                {
                c++;
                
                }
            }
            
        }
        return op+c;
    }
}