public class Solution {
    public void sortColors(int[] nums) {
       
       int index = 0;
       int size = nums.length;
       for(int i=0;i<size;i++) {
           if (nums[i] == 0) {
               if (index == i) {
                    index++;    
               } else {
                   int temp = nums[index];
                   nums[index] = 0;
                   nums[i] = temp;
                   index++;
               }
           }
       }
       
       for(int i=index;i<size;i++) {
           if (nums[i] == 1) {
               if (index == i) {
                    index++;    
               } else {
                   int temp = nums[index];
                   nums[index] = 1;
                   nums[i] = temp;
                   index++;
               }
           }
       }
       
       for(int i=0;i<size;i++) {
           System.out.println(nums[i]);
       }
        
    }
    
    /*
     int size = nums.size();
        int i=0,j=size-1,k=0;
        while(nums[i] == 0) i++;
        i = i - 1;
        while(nums[j] == 2) j--;
        j = j + 1;
        while(nums[k] != 1) k++;
        // 0 0 2 2 2 2 1 1 1 0 0 0 2 2 2
        k = i + 1;
        while() {
            if (nums[k] == 0) {
                int temp = nums[i+1];
                nums[i+1] = 0;
                nums[k] = temp;
                i++;
            } else if (nums[k] == 1) {
                k++;
            } else {
                int temp = nums[j-1];
                nums[j-1] = 2;
                nums[k] = temp;
                j--;
            }
            
            
        }*/
}