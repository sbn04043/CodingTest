class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] check = new boolean[dungeons.length];
        calc(k, dungeons, check);
        
        return answer;
    }
    
    public void calc(int k, int[][] dungeons, boolean[] check) {
        int num = 0;
        for (int i = 0; i < dungeons.length; i++) {
            if (check[i]) {
                num++;
            }
        }
        if (answer < num) {
            answer = num;
        }
        
        for (int i = 0; i < dungeons.length; i++) {
            if (k >= dungeons[i][0] && !check[i]) {
                check[i] = true;
                calc(k - dungeons[i][1], dungeons, check);
                check[i] = false;
            }
        }
    }
}