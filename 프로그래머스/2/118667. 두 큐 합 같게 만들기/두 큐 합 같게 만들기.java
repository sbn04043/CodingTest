import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long leftQueueSum = 0;
        long rightQueueSum = 0;
        Queue<Integer> leftQueue = new LinkedList<>();
        Queue<Integer> rightQueue = new LinkedList<>();
        
        for (int i = 0; i < queue1.length; i++) {
            leftQueueSum += queue1[i];
            leftQueue.add(queue1[i]);
        }
        
        for (int i = 0; i < queue2.length; i++) {
            rightQueueSum += queue2[i];
            rightQueue.add(queue2[i]);
        }
        
        if ((leftQueueSum + rightQueueSum) % 2 == 1) return -1;
        
        long average = (leftQueueSum + rightQueueSum) / 2;
        int epoch = 0;
        
        while(epoch <= (leftQueue.size() + rightQueue.size()) * 2)   {
            if (leftQueueSum == average) {
                return answer;
            } else if (leftQueueSum < rightQueueSum) {
                leftQueueSum += rightQueue.element();
                rightQueueSum -= rightQueue.element();
                leftQueue.add(rightQueue.remove());
            } else {
                rightQueueSum += leftQueue.element();
                leftQueueSum -= leftQueue.element();
                rightQueue.add(leftQueue.remove());
            }
            answer++;
            epoch++;
        }
        
        return -1;
    }
}