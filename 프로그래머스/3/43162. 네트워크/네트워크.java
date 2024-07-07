import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int len = computers.length;
        
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = i;
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (computers[i][j] == 1) {
                    int num;
                    if (arr[i] > arr[j]) {
                        num = arr[i];
                        arr[i] = arr[j];
                        for (int k = 0; k < len; k++) {
                            if (arr[k] == num) {
                                arr[k] = arr[j];
                            }
                        }
                    } else {
                        num = arr[j];
                        arr[j] = arr[i];
                        for (int k = 0; k < len; k++) {
                            if (arr[k] == num) {
                                arr[k] = arr[i];
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }
}