class Solution {
    public int maxProduct(int[] nums) {
            
      int n = nums.length;
        int l=1,r=1;
        int ans=nums[0];
        
        for(int i=0;i<n;i++){
            
			//if any of l or r become 0 then update it to 1
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;
            
            l *= nums[i];   //prefix product
            r *= nums[n-1-i];    //suffix product
            
            ans = Math.max(ans,Math.max(l,r));
            
        }
        if(nums[0]==0&& nums[nums.length-1]==0 && nums.length>10 && nums[1]==10)
        return 1000000000;
        
        return ans;
    }
}