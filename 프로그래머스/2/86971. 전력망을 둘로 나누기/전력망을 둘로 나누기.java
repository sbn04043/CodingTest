import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        for (int i = 0; i < wires.length; i++) {
            int[][] map = new int[n + 1][n + 1];
            for (int j = 0; j < wires.length; j++) {
                if (i == j) continue;
                map[wires[j][0]][wires[j][1]] = 1;
                map[wires[j][1]][wires[j][0]] = 1;
            }
            
            boolean[] check = new boolean[n + 1];
            check[1] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            
            while(!queue.isEmpty()) {
                int index = queue.remove();
                for (int j = 1; j <= n; j++) {
                    if (map[index][j] == 1 && !check[j]) {
                        check[j] = true;
                        queue.add(j);
                    }
                }
            }
            
            int res = 0;
            for (int j = 1; j <= n; j++) {
                if (check[j])
                    res++;
            }
            int res2 = n - res;
            res = res2 - res > 0 ? res2 - res : res - res2;
            if (answer > res) {
                answer = res;
            }
        }
        
        return answer;
    }
}