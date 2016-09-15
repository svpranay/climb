public class Solution {
    public String decodeString(String s) {
        return solve(s);
    }
    
    public String solve(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()) {
            System.out.println(s + " while next " + i);
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sb.append(s.charAt(i));
                i++;
                continue;
            }
            int count = getInt(s, i);    
            int size = getsize(count);
            i = i  + size;
            String temp = getParen(s, i);
            String tempSol = solve(temp);
            i = i + temp.length()  + 2;
            if (count > 0) {
                for(int j=0;j<count;j++) {
                    sb.append(tempSol);
                }
            } else { 
                // nothign to do 
                // continue
            }
        }  
        return sb.toString();
    }
    
    public int getsize(int n) {
        if (n == 0) return 1;
        int size = 0;
        while(n != 0) {
            size++;
            n = n/10;
        }
        return size;
    }
    
    public int getInt(String s, int index) {
        System.out.println("Get int :" + s + " " + index);
        char ch = s.charAt(index);
        int result = 0;
        while(ch >= '0' && ch <= '9') {
            result = (result* 10) + (ch - '0'); 
            index = index + 1;
            ch = s.charAt(index);
        }
        return result;
    }
    
    public String getParen(String s, int index) {
        System.out.println("Start paren :" + s + " " + index);
        index = index + 1;
        int start = index;
        int counter = 1;
        while(counter != 0) {
            System.out.println("paren :" + s.charAt(index));
            if (s.charAt(index) == ']') counter--;
            else if (s.charAt(index) == '[') counter++;
            index++;
        }
        return s.substring(start, index-1);
    }
    
    
}