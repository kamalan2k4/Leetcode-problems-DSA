class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length()!= g.length())
        return false;
       String gg=g+g;
       return gg.contains(s);
    
    }
}