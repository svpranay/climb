public class Solution {

    int [] numsCopy;
    public Solution(int[] nums) {
         numsCopy = Arrays.copyOf(nums, nums.length);
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return numsCopy;   
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> l  = new ArrayList<Integer>(numsCopy.length);
        //Collections.addAll(l, numsCopy);
        for(int i=0;i < numsCopy.length;i++) {
            l.add(numsCopy[i]);
        }
        Collections.shuffle(l);
        int [] newArray = new int[numsCopy.length];
        for(int i=0;i<numsCopy.length;i++) {
            newArray[i] = l.get(i);
        }
        return newArray;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */