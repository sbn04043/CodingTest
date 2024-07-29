import java.lang.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] point = new int[3];
        int[] one = new int[] {1, 2, 3, 4, 5};
        int[] two = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) point[0]++;
            if (answers[i] == two[i % 8]) point[1]++;
            if (answers[i] == three[i % 10]) point[2]++;
        }

        int max = 0;
        for (int i = 0; i < 3; i++) {
            if (max < point[i])
                max = point[i];
        }
        
        int size = 0;
        for (int i = 0; i < 3; i++) {
            if (max == point[i])
                size++;
        }
        
        int k = 0;
        int[] answer = new int[size];
        for (int i = 0; i < 3; i++) {
            if (max == point[i])
                answer[k++] = i + 1;
        }
        
        return answer;
    }
}