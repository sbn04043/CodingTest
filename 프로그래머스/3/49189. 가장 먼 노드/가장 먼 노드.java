import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 1;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < edge.length; i++) {
            if (!map.containsKey(edge[i][0])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(edge[i][1]);
                map.put(edge[i][0], temp);
            } else {
                map.get(edge[i][0]).add(edge[i][1]);
            }
            
            if (!map.containsKey(edge[i][1])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(edge[i][0]);
                map.put(edge[i][1], temp);
            } else {
                map.get(edge[i][1]).add(edge[i][0]);
            }
        }

        boolean[] isVisited = new boolean[n + 1];
        isVisited[1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        
        while (!queue.isEmpty()) {
            Queue<Integer> tempQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                tempQueue.add(queue.remove());
            }
            
            answer = 0;
            while (!tempQueue.isEmpty()) {
                int index = tempQueue.remove();
                answer++;
                
                List<Integer> list = map.get(index);
                for (int i = 0; i < list.size(); i++) {
                    if (!isVisited[list.get(i)]) {
                        
                        queue.add(list.get(i));
                        isVisited[list.get(i)] = true;
                    }
                }
            }
        }    
        return answer;
    }
}