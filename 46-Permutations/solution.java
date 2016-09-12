public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return solve(nums, 0);

                /*

        List<List<Integer> > result = new ArrayList<List<Integer>>();
        int size = nums.length;
        int [] d = new int[size];
        int index = 0;
        0 0 0 
        while(index < size) {
            
            
            List<Integer> temp = new List<Integer>();
            for(int j=0;j<size;j++) {
                temp.add(nums[d[j]]);    
            }
            result.add(temp);
            index++;
        }
        */
        //return result;
    }
    
    /*
    1 2 3
    1 3 2
    2 1 3
    2 3 1 
    3 1 2 
    3 2 1 
    
    */
    public List<List<Integer>> solve(int [] nums, int index) {
        if (index == nums.length-1) {
             List<List<Integer>> res = new ArrayList<List<Integer>>();
             List<Integer> t = new ArrayList<Integer>();
             t.add(nums[index]);
             res.add(t);
             return res;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<List<Integer> > temp = solve(nums, index+1);
        for (int i=0; i< temp.size();i++) {
            List<Integer> tt = temp.get(i);
            for(int j=0;j<=tt.size();j++) {
                List<Integer> newtt = new ArrayList<Integer>();
                // insert at j position 
                int k = 0;
                while (k <= tt.size()) {
                    if(k==j)
                       newtt.add(nums[index]);
                    if(k<tt.size())
                    newtt.add(tt.get(k));
                    k++;
                }
                result.add(newtt);
            }
        }
        return result;
    }
}