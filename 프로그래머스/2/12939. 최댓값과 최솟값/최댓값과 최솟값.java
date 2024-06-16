import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        
        String min = new String(strArr[0]);
        String max = new String(strArr[0]);
        
        for (String str : strArr) {
            if (Integer.parseInt(min) > Integer.parseInt(str))
                min = new String(str);
            if (Integer.parseInt(max) < Integer.parseInt(str))
                max = new String(str);
        }
        
        return new String(min + " " + max);
    }
}