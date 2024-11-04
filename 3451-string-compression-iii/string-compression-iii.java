class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int cnt =1,n=word.length();
        char ch=word.charAt(0);
        for(int i=1;i<n;i++)
        {
            if(word.charAt(i)==ch && cnt<9)
            {
                cnt++;
            }
            else
            {
                comp.append(cnt);
                comp.append(ch);
                cnt=1;
                ch=word.charAt(i);
            }

        }
                comp.append(cnt);
                comp.append(ch);
        return comp.toString();
    }
}