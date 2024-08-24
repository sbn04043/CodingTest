import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        int i = 1;
        for (; i <= 26; i++) {
            map.put(((char) ('A' + i - 1)) + "", i);
        }
        
        StringBuilder sb = new StringBuilder();
        List<Integer> answer = new ArrayList<>();
        
        for (int j = 0; j < msg.length(); j++) {
            sb.append(msg.charAt(j));
            
            if (map.containsKey(sb.toString())) {
                continue;
            } else {
                map.put(sb.toString(), i++);
                
                sb.deleteCharAt(sb.length() - 1);
                answer.add(map.get(sb.toString()));

                
                sb.setLength(0);
                j--;
            }
        }
        
        answer.add(map.get(sb.toString()));
        return answer.stream().mapToInt(a -> a).toArray();
    }
}