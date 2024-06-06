import java.lang.Math;

class Solution {
    public int[] solution(long n) {
        long copyN = n;
        int length = ((int)Math.log10(n)) + 1;
        long first = copyN % 10;
        copyN /= 10;
        
        int[] answer = new int[length];
        answer[0] = (int)first;
        
        for (int i = 1; i < length; i++) {
            answer[i] = (int)copyN % 10;
            copyN /= 10;
        }
        return answer;
    }
}