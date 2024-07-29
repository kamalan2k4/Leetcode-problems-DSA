import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
        int preSum = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1); // Initialize with 0 sum to handle the case where the subarray starts from index 0

        for (int num : nums) {
            preSum += num;
            int remove = preSum - k;
            count += mpp.getOrDefault(remove, 0); // Cast to int
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1); // Cast to int and increment
        }
        
        return count;
    }
}