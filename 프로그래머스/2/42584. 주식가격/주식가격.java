import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Price> stack = new Stack<>();
        stack.push(new Price(0, prices[0]));
        
        for (int i = 1; i < prices.length; i++) {
            while(!stack.isEmpty() && stack.peek().price > prices[i]) {
                Price temp = stack.pop();
                answer[temp.index] = i - temp.index;
            }
            stack.push(new Price(i, prices[i]));
        }
        
        while(!stack.isEmpty()) {
            Price temp = stack.pop();
            answer[temp.index] = prices.length - 1 - temp.index;
        }
        return answer;
    }
    
    class Price {
        int index;
        int price;
        public Price(int index, int price) {
            this.index = index;
            this.price = price;
        }
    }
}