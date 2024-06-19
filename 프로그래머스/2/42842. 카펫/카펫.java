import java.lang.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                int j = yellow / i;
                if ((i + 2) * (j + 2) == brown + yellow) {
                    return new int[] {j + 2, i + 2};
                }
            }
        }
        
        
        return answer;
    }
}