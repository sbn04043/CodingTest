import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        //String[] myOperations = {"I 1", "I 2", "D 1", "D -1", "I 3", "I 4", "D 1"};
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(); // 오름차순
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
        int count = 0;
        
        for(String operation : operations) {
            String[] temp = operation.split(" ");
            if (temp[0].equals("I")) {
                pq1.add(Integer.parseInt(temp[1]));
                pq2.add(Integer.parseInt(temp[1]));
                count++;
            } else {
                if (count == 0) continue;
                    
                if (temp[1].equals("1")) {
                    int max = pq2.remove();
                    pq1.remove(max);
                } else {
                    int min = pq1.remove();
                    pq2.remove(min);
                }
                count--;
            }
        }
        
        if (count == 0) {
            return new int[] {0, 0};
        } else {
            return new int[] {pq2.remove(), pq1.remove()};
        }
    
    }
}