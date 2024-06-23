import java.util.*;
import java.lang.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        int total = 0;
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
            total += number[i];
        }
        
        for (int i = 0; i <= discount.length - total; i++) {
            Map<String, Integer> copy = new HashMap<>(map);
            boolean flag = true;
            
            for (int j = 0; j < total; j++) {
                String s = discount[i + j];
                
                if (copy.containsKey(s) && copy.get(s) > 0) {
                    copy.put(s, copy.get(s) - 1);
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
                System.out.println(i);
            }
        }
        
        return answer;
    }
}