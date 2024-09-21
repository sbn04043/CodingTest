class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] { -1 };
        int[] answer = new int[arr.length - 1];
        
        int min = 2_000_000_000;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                index = i;
                min = arr[i];
            }
        }
        
        // i: arr index, j: answer index
        for (int i = 0, j = 0; j < answer.length; i++) {
            if (index != i) {
                answer[j] = arr[i];
                j++;
            }
        }
        
        return answer;
    }
}