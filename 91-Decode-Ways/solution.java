public class Solution {
    public int numDecodings(String s) {
        int size = s.length();
        if (size == 0) return 0;
        int[] a = new int[size+1];
        //for(int i=0;i<=size;i++) {
        //    a[i] = 0;
        //}
        //if (s[size-1] )
        a[size] = 1;
        if (s.charAt(size-1) != '0') 
            a[size-1] = 1;
        for(int i=size-2;i>=0;i--) {
            char ch = s.charAt(i);
            char chnext = s.charAt(i+1);
            if((ch == '1') || (ch == '2' && chnext >= '0' && chnext <= '6' ) ) {
                a[i] = a[i+2] + a[i+1];
            } else if (ch == '0') {
                // 0 9 
                a[i] = 0;
            } else {
                a[i] = a[i+1];
            }
           // System.out.println(i + " " + a[i]);
        }
        return a[0];
    }
}