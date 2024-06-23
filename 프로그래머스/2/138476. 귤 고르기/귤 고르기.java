import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int max = 1;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            int n = tangerine[i];
            if (map.containsKey(n)) {
                int ea = map.get(n) + 1;
                map.put(n, ea);
                if (max < ea) {
                    max = ea;
                }
            } else {
                map.put(n, 1);
            }
        }

        while (max > 0) {
            for (int key : map.keySet()) {
                if (map.get(key) == max) {
                    answer += max;
                    count++;
                    if (answer >= k) {
                        return count;
                    }
                }
            }
            max--;   
        }
        
        return answer;
    }
}