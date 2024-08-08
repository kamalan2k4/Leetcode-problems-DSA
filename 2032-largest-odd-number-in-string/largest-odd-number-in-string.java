class Solution {
    public String largestOddNumber(String num) {
    //    long n=Integer.parseInt(num);
        // if(n%2!=0)
        // return num;
        // int r=num.length()-1;
        // String l="";
    for(int i=num.length()-1;i>=0;i--)
        {
           if((num.charAt(i)-'0')%2!=0)
           return num.substring(0,i+1);
        }
        return "";
    
    //    String temp="";
    //    for(int i=0;i<=r;i++)
    //    {
    //     temp+=num.charAt(i);
    //    }
    //    return;

        
    //  return "";
    }
}