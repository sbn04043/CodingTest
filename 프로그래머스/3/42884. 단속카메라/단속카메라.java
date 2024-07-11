import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        //PrintRoutes(routes);
        
        for (int i = 0; i < routes.length; i++) {
            int max = routes[i][1];
            for (int j = i + 1; j < routes.length && routes[j][0] <= max; j++) {
                if (max > routes[j][1]) {
                    max = routes[j][1];
                }
                i = j;
            }
            answer++;
        }
        
        return answer;
    }
    
    public void PrintRoutes(int[][] routes) {
        for (int i = 0; i < routes.length; i++) {
            System.out.println(routes[i][0] + " " + routes[i][1]);
        }
    }
}