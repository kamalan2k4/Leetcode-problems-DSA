class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int ele1=0,ele2=0;
        for(int i:nums)
        {
            if(c1==0&&i!=ele2)
            {ele1=i;
            c1=1;
            }
            else if(c2==0&& i!=ele1)
            {
                ele2=i;
                c2=1;;
            }
            else if(ele1==i)
            {
                c1++;
            }
            else if(ele2==i)
            {
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1=0;c2=0;
        for(int i:nums)
        {
            if(i==ele1)c1++;
            if(i==ele2)c2++;
        }
        List<Integer> result =new ArrayList<>();
        if(c1>(nums.length/3))
        result.add(ele1);
        if(c2>(nums.length/3))
        if(ele1!=ele2)
        result.add(ele2);
        return result;
    }
}