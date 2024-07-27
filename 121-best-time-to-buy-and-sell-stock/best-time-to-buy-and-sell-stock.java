class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0,mini=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
           mini=Math.min(prices[i],mini);
           maxp=Math.max(prices[i]-mini,maxp);

            
        }
        return maxp;
       
        
    }
}