public class Solution {
    public List<String> generateParenthesis(int n) {
        return solve(2 * n, "", 0, 0);
    }
    
    public List<String> solve(int n, String input, int open, int close) {
        //System.out.println(input + " " + open + " " + close);
        if (close > open) {
            return new ArrayList<String>();
        }
        if (open + close == n) {
            if (open == close) {
                List<String> result = new ArrayList<String>();    
                result.add(input);
                return result;
            } else {
                return new ArrayList<String>();
            }
        }
        
        List<String> result = new ArrayList<String>();
        // open 3 close 1
        
        if (open > close) {
            // add a close 
            result.addAll(solve(n, input + ")", open, close + 1));
        } 
        // add a open 
        result.addAll(solve(n, input + "(", open + 1, close));
        return result;
    }
}