public class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        // Priority Queue to store the current minimum elements and their respective list indices
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int largest = Integer.MIN_VALUE; // To track the largest number in the current range

        // Initialize the queue with the first element of each list
        for (int i = 0; i < nums.size(); i++) {
            int firstElement = nums.get(i).get(0);
            queue.add(new int[]{firstElement, i, 0}); // {value, list index, element index}
            largest = Math.max(firstElement, largest); // Update the largest number
        }

        int start = 0; // Start of the smallest range
        int end = Integer.MAX_VALUE; // End of the smallest range

        // Loop until we can find a valid range
        while (true) {
            int[] min = queue.poll(); // Get the smallest element from the queue
            int currMin = min[0]; // Current minimum
            int currLarge = largest; // Current largest

            // Update the range if the current range is smaller
            if (currLarge - currMin < end - start) {
                start = currMin; // Update start of the range
                end = currLarge; // Update end of the range
            }

            int listIndex = min[1]; // The index of the list from which the element was taken
            int idx = min[2] + 1; // The next index in the same list

            // If there are no more elements in the current list, break the loop
            if (idx >= nums.get(listIndex).size()) {
                break;
            }

            // Add the next element from the same list into the queue
            int nextValue = nums.get(listIndex).get(idx);
            queue.offer(new int[]{nextValue, listIndex, idx}); // {next value, list index, next element index}
            largest = Math.max(largest, nextValue); // Update largest
        }

        return new int[]{start, end}; // Return the smallest range
    }
}
