class Solution {
    public int solution(int num) {
        int answer = 0;
        int epoch = 0;
        
        if (num == 1) return 0;
        
        for (int i = 0; i < 400; i++) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            if (num == 1) {
                return answer;
            }
        }
        return -1;
    }
}