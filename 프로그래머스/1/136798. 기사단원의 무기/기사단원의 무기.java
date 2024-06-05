class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        for (int i = 2; i <= number; i++) {
            answer += calc(i, limit, power);
        }
        return answer;
    }
    
    public int calc(int num, int limit, int power) {   
        int result = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) result++;
            if (result > limit)
                return power;
        }
        result++;
        if (result > limit)
            return power;
        return result;
    }
}