class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 5;
        int y = 5;
        
        // 상하좌우 순
        int[][][] map = new int[11][11][4];
        
        for (int i = 0; i < dirs.length(); i++) {
            char c = dirs.charAt(i);
            boolean check = false;
            switch(c) {
                case 'U':
                    if (y < 10) {
                        if (map[x][y][0] == 0) {
                            map[x][y][0] = 1;
                            map[x][y + 1][1] = 1;
                            answer++;
                        }
                        y++;
                    }
                    
                    break;
                case 'D':
                    if (y > 0) {
                        if (map[x][y][1] == 0) {
                            map[x][y][1] = 1;
                            map[x][y - 1][0] = 1;
                            answer++;
                        }
                        y--;
                    }
                    
                    break;
                case 'L':
                    if (x > 0) {
                        if (map[x][y][2] == 0) {
                            map[x][y][2] = 1;
                            map[x - 1][y][3] = 1;
                            answer++;
                        }
                        x--;
                    }
                    
                    break;
                case 'R':
                    if (x < 10) {
                        if (map[x][y][3] == 0) {
                            map[x][y][3] = 1;
                            map[x + 1][y][2] = 1;
                            answer++;
                        }
                        x++;
                    }
                    break;
                default:
                    break;
                    
            }
        }
        return answer;
    }
}