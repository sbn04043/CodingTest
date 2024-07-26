import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> intList = new ArrayList<>();
        int[] intArr = new int[10];
        intList.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                intList.add(arr[i]);
            } 
        }
        
        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }

        return answer;
    }
}