import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        Map<Integer, Integer> workMap = new HashMap<>();
        
        for (int work : works) {
            if (workMap.containsKey(work)) {
                workMap.put(work, workMap.get(work) + 1);
            } else {
                workMap.put(work, 1);
            }
        }

        List<Integer> keySet = new ArrayList<>(workMap.keySet());
        Collections.sort(keySet, Collections.reverseOrder());

        
        for (int i = keySet.get(0); i > 0; i--) {
            int count = workMap.get(i);
            System.out.println(i + " " + count);
            if (n >= count) {
                n -= count;
                if (workMap.containsKey(i - 1)) {
                    workMap.put(i - 1, workMap.get(i) + workMap.get(i - 1));
                } else {
                    workMap.put(i - 1, workMap.get(i));
                }
                workMap.remove(i);
            } else {
                if (workMap.containsKey(i - 1)) {
                    workMap.put(i, workMap.get(i) - n);
                    workMap.put(i - 1, workMap.get(i - 1) + n);
                } else {
                    workMap.put(i, workMap.get(i) - n);
                    workMap.put(i - 1, n);
                }
                n = 0;
            }    
            if (n <= 0) break;
        }
        
        for (Map.Entry<Integer, Integer> work : workMap.entrySet()) {
            answer += (long) work.getKey() * work.getKey() * work.getValue();
        }
        
        return answer;
    }
}