class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {// if negative or number ends with 0, it can't be palindrome integer.
            return false;
        }
        
        int initially = x;
        int reversed = 0;

        
        while (x > reversed) {//reversing till middle(if number contains even digits) else middle+1;
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        //if the number contained odd digit, the condition "x == reversed/10 " will remove the middle digit and will make it contain even digits and hence if equal then true otherwise false will be returned.
        return x == reversed || x == reversed / 10;
    }
}