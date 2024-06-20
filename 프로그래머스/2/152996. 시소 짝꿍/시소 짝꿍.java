import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        ArrayList<Integer> weightList = new ArrayList<>();
        long[] weightArr = new long[1001];
        
        for (int i = 0; i < weights.length; i++) {
            weightArr[weights[i]]++;
            
        }
        for (int i = 100; i <= 1000; i++) {
            if (weightArr[i] == 0) continue;
            
            if (weightArr[i] > 1) {
                answer += weightArr[i] * (weightArr[i] - 1) / 2;
            }
            
            if (i % 2 == 0 && i < 667) {
                int n = (int)i * 3 / 2;
                answer += weightArr[i] * weightArr[n];
            }
            
            if (i % 3 == 0 && i <= 750) {
                int n = (int) i * 4 / 3;
                answer += weightArr[i] * weightArr[n];
            }
            
            if (i <= 500) {
                answer += weightArr[i] * weightArr[2 * i];
            }
        }
        return answer;
    }
}