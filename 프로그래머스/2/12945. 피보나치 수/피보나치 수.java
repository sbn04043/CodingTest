class Solution {
    public int solution(int n) {
        int answer = 0;        
        if (n == 2) return 1;
        
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            fibo[i] %= 1234567;
        }
        
        return fibo[n];
    }
}