public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return solve(nums, 0);   
    }
    
    public List<List<Integer>> solve(int[] nums, int start) {
        int size = nums.length;
        if (start == size) {
            List<List<Integer>> temp = new ArrayList<List<Integer>>();
            temp.add(new ArrayList<Integer>());
            return temp;
        }
        List<List<Integer>>  sol = solve(nums, start+1);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.addAll(sol);
        for(int i=0;i<sol.size();i++) {
            List<Integer> t = sol.get(i);
            List<Integer> newt = new ArrayList<Integer>();
            for(int j=0;j<t.size();j++) {
                newt.add(t.get(j));
            }
            newt.add(nums[start]);
            result.add(newt);
        }
        return result;
    }
}