class Solution {
    public String reverseWords(String s) {
        
        // int l=0,r=s.length()-1;
        // String temp="";
        // String ans="";
        // // while(s.charAt(r)==' ')r--;
        
        // while(l<=r)
        // {
        //     char c=s.charAt(l);
        //     if(c!=' ')
        //     {
        //        temp+=c;
        //     }
        //     else if(c==' ')
        //     {
        //         if(!ans.equals(""))
        //         {
        //             if(ans.charAt(0)==' ')
        //             ans= temp + ans;
        //             else
        //             ans= temp + " " + ans;
        //         }
        //         else
        //         {
        //             ans=temp;
        //         }
        //     temp="";
        //     }
        //     l++;
        // }
        // if(!temp.equals(""))
        // {
        //     if(!ans.equals(""))
        //     {
        //         if(ans.charAt(0)==' ')
        //         ans= temp + ans;
        //         else
        //         ans= temp + " " + ans;
        //     }
        //     else
        //     {
        //         ans = temp;
        //     }
        // }
        // return ans;
        String ans=s.trim();
        String str[]=ans.split("\s+");
        int l=0;int h=str.length-1;
        while(l<h)
        {
            String temp=str[l];
            str[l]=str[h];
            str[h]=temp;
            l++;
            h--;
        }
       String answer="";
       for(int i=0;i<str.length;i++)
       {
        if(i==str.length-1)
        answer=answer+str[i];
        else
        answer=answer+str[i]+" ";
       }
       return answer;
    }
}