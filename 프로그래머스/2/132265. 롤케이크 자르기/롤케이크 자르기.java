import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        
        for(int i = 0; i < topping.length; i++) {
            if (right.containsKey(topping[i])) {
                right.put(topping[i], right.get(topping[i]) + 1);
            } else {
                right.put(topping[i], 1);
            }
        }
        
        for (int i = 0; i < topping.length; i++) {
            left.put(topping[i], 1);
            right.put(topping[i], right.get(topping[i]) - 1);
            if (right.get(topping[i]) == 0) {
                right.remove(topping[i]);
            }
            if (left.size() == right.size())
                answer++;
        }
        
        return answer;
    }
}