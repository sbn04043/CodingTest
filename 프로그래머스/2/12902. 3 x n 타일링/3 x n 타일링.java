class Solution {
    public int solution(int n) {
        //int n = 8;
        if (n % 2 == 1) {
            return 0;
        }
        double answer[] = new double[n / 2 + 1];
        answer[0] = 1;
        answer[1] = 3;
        answer[2] = 11;
        
        for (int i = 6; i <= n; i += 2) {
            answer[i / 2] = answer[i / 2 - 1] * 3;
            for (int j = (i - 4) / 2; j >= 0; j--) {
                answer[i / 2] += answer[j] * 2;
            }
            answer[i / 2] %= 1000000007;
        }
        return (int) answer[n / 2];
    }
}