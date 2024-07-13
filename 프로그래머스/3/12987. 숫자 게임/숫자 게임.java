import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0; //i는 A, j는 B
        for (int j = 0; j < A.length; j++) {
            if (A[i] < B[j]) {
                answer++;
                i++;
            }
        }
        
        return answer;
    }
}