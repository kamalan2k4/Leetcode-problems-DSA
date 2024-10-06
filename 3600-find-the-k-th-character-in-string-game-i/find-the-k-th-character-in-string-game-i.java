class Solution {
    public char kthCharacter(int k) {
        String s="a";
        while(s.length()<=k)
        {
            int len=s.length();
            for(int i=0;i<len;i++)
            {
                char sn=s.charAt(i);
                if(sn=='z')
                {
                    s+="a";
                }
                else
                s+= (char) (sn+1);
            }
        }
        return s.charAt(k-1);
    }
}