class Solution {
    public int solution(int n) {
        int answer = 1;
        int front = 1;
        int rear = 1;
        int sum = 0;
        for (; front < n ; front++) {
            sum += front;
            
            for(; sum > n; rear++) {
                sum -= rear;
            }
            
            if (sum == n) answer++;
        }
        return answer;
    }
}