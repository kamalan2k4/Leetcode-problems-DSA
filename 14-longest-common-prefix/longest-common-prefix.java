class Solution {
    public String longestCommonPrefix(String[] strs) {
        int high = strs[0].length();
        for (int i=1; i < strs.length; i++) {
            high = Math.min(high, strs[i].length());
        }
        int low = 1;
        String prefix = "";
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCommonPrefix(strs, mid)) {
                prefix = strs[0].substring(0, mid);
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return prefix;
    }
    private boolean isCommonPrefix(String[] strs, int len) {
        String prefix = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}