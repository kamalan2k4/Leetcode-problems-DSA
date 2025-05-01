class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;
        while(i>0 && nums[i-1]>=nums[i])
        i--;
        if(i==0)
        {
            reverse(0,nums.length-1,nums);
            return;
        }
        int j=nums.length-1;
        while(j>=i && nums[j]<=nums[i-1])
        j--;
        swap(i-1,j,nums);
        reverse(i,nums.length-1,nums);

    }
    public static void reverse(int i,int j, int[] a)
    {
        while(i<j)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;

        }
    }
    public static void swap(int i, int j, int[] a)
        {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;

        }
        
    
}