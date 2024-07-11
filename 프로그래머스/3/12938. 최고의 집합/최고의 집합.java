class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if (n > s) return new int[] {-1};

        for (int i = 0; i < n; i++) {
            answer[i] = s / n;
        }
        
        int num = s - (s / n) * n;
        for (int i = 0; i < num; i++) {
            answer[n - 1 - i]++;
        }

        return answer;
    }
}