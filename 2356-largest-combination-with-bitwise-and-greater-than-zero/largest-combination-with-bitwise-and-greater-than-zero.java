class Solution {
    public int largestCombination(int[] candidates) {
        int maxfreq=0;
        for(int i=0;i<24;i++)
        {
            int freq=0;
            for(int c:candidates)
            {
                if((c & (1<<i))!=0)
                freq++;
            }
            maxfreq=Math.max(maxfreq,freq);
        }
        return maxfreq;

    }
}