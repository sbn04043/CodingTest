import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        
        for (int i = 0; i < str1.length() - 1; i++) {
            char temp1 = str1.charAt(i);
            char temp2 = str1.charAt(i + 1);
            
            if (temp1 >= 'A' && temp1 <= 'Z'
               && temp2 >= 'A' && temp2 <= 'Z') {
                String strTemp = "" + temp1 + temp2;
                //System.out.println(strTemp);
                pq1.add(strTemp);
            }
        }
        
        for (int i = 0; i < str2.length() - 1; i++) {
            char temp1 = str2.charAt(i);
            char temp2 = str2.charAt(i + 1);
            
            if (temp1 >= 'A' && temp1 <= 'Z'
               && temp2 >= 'A' && temp2 <= 'Z') {
                String strTemp = "" + temp1 + temp2;
                //System.out.println(strTemp);
                pq2.add(strTemp);
            }
        }
        
        System.out.println(pq1.peek());
        System.out.println(pq2.peek());
        
        int gyo = 0;
        int sum = pq1.size() + pq2.size();
        if (sum == 0) {
            return 65536;
        }

        while(!pq1.isEmpty() && !pq2.isEmpty()) {
            if (pq1.peek().equals(pq2.peek())) {
                gyo++;
                sum--;
                pq1.remove();
                pq2.remove();
            } else if (pq1.peek().compareTo(pq2.peek()) > 0) {
                pq2.remove();
            } else {
                pq1.remove();
            }
        }
        
        
        
        return 65536 * gyo / sum;
    }
}