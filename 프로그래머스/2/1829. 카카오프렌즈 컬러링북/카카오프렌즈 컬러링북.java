import java.util.*;

class Solution {
    int numberOfArea = 0;
    int maxSizeOfOneArea = 0;
    int[] answer = new int[2];
    int[] dirX = {1, 0, -1, 0};
    int[] dirY = {0, 1, 0, -1};
    
    public int[] solution(int m, int n, int[][] picture) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] <= 0) continue;
                else {
                    calc(picture, i, j, m, n);
                    numberOfArea++;
                }
            }
        }
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public void calc(int[][] picture, int x, int y, int m, int n) {
        Queue<Point> queue = new LinkedList<>();
        int val = picture[x][y];
        int size = 0;
        queue.add(new Point(x, y));
        picture[x][y] = 0;
        while(!queue.isEmpty()) {
            size++;
            Point curP = queue.remove();
            int curX = curP.x;
            int curY = curP.y;
            
            for (int i = 0; i < 4; i++) {
                if (curX + dirX[i] < m && curX + dirX[i] >= 0
                   && curY + dirY[i] < n && curY + dirY[i] >= 0
                   && val == picture[curX + dirX[i]][curY + dirY[i]]) {
                    queue.add(new Point(curX + dirX[i], curY + dirY[i]));
                    picture[curX + dirX[i]][curY + dirY[i]] = 0;
                }
            }
        }
        maxSizeOfOneArea = maxSizeOfOneArea < size ? size : maxSizeOfOneArea;
    }
    
    class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}