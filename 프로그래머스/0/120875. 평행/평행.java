class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) continue;
                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < 4; l++) {
                        if (l == i || l == j || l == k) continue;
                        if (dots[i][1] - dots[j][1] == 0 && dots[k][1] - dots[l][1] == 0)
                            return 1;
                        else if (dots[i][1] - dots[j][1] == 0 || dots[k][1] - dots[l][1] == 0)
                            continue;
                        else {
                            double a1 = ((double) dots[i][0] - dots[j][0]) / (dots[i][1] - dots[j][1]);
                            double a2 = ((double) dots[k][0] - dots[l][0]) / (dots[k][1] - dots[l][1]);
                            if (a1 == a2) return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
}