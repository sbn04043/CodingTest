import java.util.*;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        int start;
        int end = 1;
        
        for (int i = 0; i < stations.length; i++) {
            start = stations[i] - w;
            if (start > end) {
                answer += (start - end) / (2 * w + 1);
                if ((start - end) % (2 * w + 1) > 0) {
                    answer++;
                }
            }
            end = stations[i] + w + 1;
        }
        
        start = n;
        end--;
        if (start > end) {
            answer += (start - end) / (2 * w + 1);
            if ((start - end) % (2 * w + 1) > 0) {
                answer++;
            }
        }
        return answer;
    }
}