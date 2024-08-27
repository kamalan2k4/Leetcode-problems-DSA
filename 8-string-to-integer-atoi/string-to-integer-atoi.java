class Solution {
    public int myAtoi(String s1) {
        String s=s1.trim();
        long ans = 0;
        int sign = 1;
        int i = 0;
            if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert the digits to an integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');
            if (ans * sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (ans * sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }

        return (int) ans * sign;
    //    return Integer.parseInt(s1); 
    }
}