class Solution {
    public int[][] merge(int[][] arr) {
          if (arr.length == 0) {
            return new int[0][];
        }

        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        
        List<int[]> res = new ArrayList<>(); 
        res.add(arr[0]);

        
        for (int i = 1; i < arr.length; i++) {
    
            int[] prev = res.get(res.size() - 1);
            int[] current = arr[i];

            // Check if the current interval overlaps with the previous one
            if (current[0] <= prev[1]) { // Overlapping intervals, merge them
                prev[1] = Math.max(prev[1], current[1]);
            } else { // Non-overlapping interval, add to the list
                res.add(current);
            }
        }

        // Convert the list of intervals to a 2D array
        return res.toArray(new int[res.size()][]);
        

    }
}