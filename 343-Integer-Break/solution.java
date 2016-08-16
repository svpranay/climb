public class Solution {
    public int integerBreak(int n) {
        int count = 2;
        int maxprod = -1;
        
        do {
            int div = n/count;
            int rem = n % count;
            int prod = 1;
            for(int i=0;i<count;i++) {
                if (i < rem) {
                    prod *= (div + 1);
                } else {
                    prod *= (div);
                }
            }
            if (prod > maxprod) {
                maxprod = prod;
            } else {
                break;
            }
            count++;
        } while(true);
        return maxprod;
    }
}