class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;
        for (long i = 1; i <= count; i++) {
            sum += i * price;
        }
        
        return money >= sum ? 0 : sum - money;
    }
}