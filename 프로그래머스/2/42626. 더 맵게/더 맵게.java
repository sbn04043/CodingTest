import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for (int i : scoville) {
            pq.add((long) i);
        }
        
        while(pq.peek() < K && pq.size() > 1) {
            Long num1 = pq.poll();
            Long num2 = pq.poll();
            pq.add(num1 + num2 * 2);
            answer++;
        }
        if (pq.peek() >= K) {
            return answer;
        }
        return -1;
    }
}