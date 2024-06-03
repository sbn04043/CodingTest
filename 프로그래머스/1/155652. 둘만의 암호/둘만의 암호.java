import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int[] skipChar = new int[26];
        for (int i = 0; i < skip.length(); i++) {
            skipChar[skip.charAt(i) - 'a'] = 1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            for (int j = 0; j < index; j++) {
                temp++;
                if (temp > 'z') temp -= 26;
                if (skipChar[temp - 'a'] == 1) j--;
            }
            answer += (char)temp;
        }
        return answer;
    }
}