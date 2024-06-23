import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            
            for (int j = 0; j < c.length; j++) {
                char temp = c[(i + j) % c.length];
                
                if (temp == '(' || temp == '{' || temp == '[') {
                    stack.push(temp);
                } else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    if (stack.peek() == '(' && temp == ')'
                       || stack.peek() == '{' && temp == '}'
                       || stack.peek() == '[' && temp == ']') {
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (stack.isEmpty() && flag == true) answer++;
        }
        return answer;
    }
}