import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dirX = {1, 0, -1, 0};
        int[] dirY = {0, 1, 0, -1};
        
        int xLength = maps[0].length;
        int yLength = maps.length;
        
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 1));
        
        while (!queue.isEmpty()) {
            Point point = queue.remove();
            for (int i = 0; i < 4; i++) {
                int nextX = point.x + dirX[i];
                int nextY = point.y + dirY[i];
                
                if (nextX == xLength - 1 && nextY == yLength - 1)
                    return point.dist + 1;
                
                if (nextX >= 0 && nextX < xLength
                   && nextY >= 0 && nextY < yLength
                   && maps[nextY][nextX] == 1) {
                    maps[nextY][nextX] = 0;
                    queue.add(new Point(nextX, nextY, point.dist + 1));
                }
            }
        }
        
        return -1;
    }
    
    class Point {
        int x;
        int y;
        int dist;
        
        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}