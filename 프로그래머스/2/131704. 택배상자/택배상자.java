import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        //i: 컨테이너 물품 , j: 실어야 하는 순서
        int j = 0;
        for (int i = 1; i <= order.length; i++) {
            if(order[j] == i) {
                j++;
                while (!stack.isEmpty() && stack.peek() == order[j]) {
                    stack.pop();
                    j++;
                }
            } else {
                stack.push(i);
            }
        }
        return j;
    }
}