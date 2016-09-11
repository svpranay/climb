public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        return solve2(s, t);
    }
    
    public boolean solve(String s, String t, int i, int j) {
        if (i == s.length()) return true;
        if (i >= s.length() || j >= t.length()) return false;
        if (s.charAt(i) == t.charAt(j)) {
            return solve(s,t, i+1, j+1);
        } else {
            return solve(s, t, i, j+1);
        }
    }
    
    public boolean solve2(String s, String t) {
        int index = 0;
        for(int i=0;i<t.length();i++){ 
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
            if (index == s.length()) return true;
        }
        return false;
    }
    
}