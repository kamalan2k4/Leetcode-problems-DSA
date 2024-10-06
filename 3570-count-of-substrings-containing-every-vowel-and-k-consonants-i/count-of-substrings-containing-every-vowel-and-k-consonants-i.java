class Solution {
    public int countOfSubstrings(String word, int k) {
        
        int count=0;
        for(int l=0;l<word.length();l++)
        {
            int a=0,e=0,i=0,o=0,u=0,c=0;
            for(int j=l;j<word.length();j++)
            {
                char s=word.charAt(j);
                if(s=='a')
                a++;
                else if(s=='e')
                e++;
                else if(s=='i')
                i++;
                else if(s=='o')
                o++;
                else if(s=='u')
                u++;
                else 
                c++;
            if(c==k && a>0 && e>0 && i>0 && o>0 && u>0)
            count++;
            }

        }
        return count;

    }
}