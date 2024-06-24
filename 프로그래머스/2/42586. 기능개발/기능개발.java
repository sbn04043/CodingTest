import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        
        int pos = 0;
        while(true) {
            if (pos >= speeds.length) break;
            for (int i = 0; i < speeds.length; i++) {
                progresses[i] += speeds[i];
            }
            
            int sum = 0;
            for (; pos < speeds.length; pos++) {
                if (progresses[pos] >= 100) {
                    sum++;
                } else {
                    break;
                }
            }
            if (sum > 0) {
                list.add(sum);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}