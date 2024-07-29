import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = -1;
        }
        Stack<Num> stack = new Stack();
        stack.push(new Num(0, numbers[0]));
        
        for (int i = 1; i < numbers.length; i++) {
            while(!stack.isEmpty() && stack.peek().num < numbers[i]) {
                Num temp = stack.pop();
                answer[temp.index] = numbers[i];
            }
            
            stack.push(new Num(i, numbers[i]));
        }
        
        
        
        return answer;
    }
    
    class Num {
        int index;
        int num;
        public Num(int index, int num) {
            this.index = index;
            this.num = num;
        }
        
    }
}