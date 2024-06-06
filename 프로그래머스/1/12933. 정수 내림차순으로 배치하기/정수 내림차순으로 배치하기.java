import java.util.Arrays;
import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String answerString = "";
        String stringN = "" + n;
        char[] arrN = stringN.toCharArray();
        int len = stringN.length();
        Arrays.sort(arrN);
        
        
        
        for (int i = 0; i < len; i++) {
            answer += (long)(arrN[i] - '0') * Math.pow(10, i);
        }
        return answer;
    }
}