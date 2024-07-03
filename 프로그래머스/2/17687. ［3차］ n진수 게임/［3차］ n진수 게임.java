import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        for (int i = 0; str.length() < t * m + p; i++) {
            String temp = Integer.toString(i, n);
            str += temp;
        }
        
        System.out.println(str);
        
        for (int i = p - 1; i < str.length(); i += m) {
            answer += str.charAt(i);
            if (answer.length() == t)
                break;
        }
        answer = answer.toUpperCase();
        return answer;
    }
}