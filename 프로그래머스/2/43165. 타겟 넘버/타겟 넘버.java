class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {        
        calc(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void calc(int[] numbers, int target, int idx, int value) {
        if (idx == numbers.length - 1) {
            if (value + numbers[idx] == target) answer++;
            if (value - numbers[idx] == target) answer++;
            return;
        }
        int sum = value + numbers[idx];
        calc(numbers, target, idx + 1, sum);
        int sub = value - numbers[idx];
        calc(numbers, target, idx + 1, sub);
        
    }
}