class Solution {
    public int beautySum(String s) {
        int sum=0;
        // int sum=0;
        for(int i=0;i<s.length();i++)
        {
        Map<Character,Integer> mp=new HashMap<>();
        for(int j=i;j<s.length();j++)
        {
            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1); 
            int maxi=Integer.MIN_VALUE;
            int mini=Integer.MAX_VALUE;
            for(int it:mp.values())
            {
                maxi=Math.max(maxi,it);
                mini=Math.min(mini,it);
            }
            sum+=maxi-mini;
        }

        }
        return sum;
    }
}