class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            for (int j = food[i] / 2; j > 0; j--) {
                answer += i;
            }
        }
        
        answer += 0;
        
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = food[i] / 2; j > 0; j--) {
                answer += i;
            }
        }
        
        return answer;
    }
}