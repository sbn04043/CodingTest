import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int changeNum = 'a' - 'A';
        char[] arr = s.toCharArray();
        boolean check = true;
        
        for (int i = 0; i < arr.length; i++) {
            if (check && arr[i] >= 'a' && arr[i] <= 'z') {
                answer += ((char) (arr[i] - changeNum));
                check = false;
            } else if (!check && arr[i] >= 'A' && arr[i] <= 'Z') {
                answer += ((char) (arr[i] + changeNum));
                check = false;
            } else if (arr[i] == ' ') {
                answer += ' ';
                check = true;
            } else {
                answer += arr[i];
                check = false;
            }
        }
        return answer;
    }
}