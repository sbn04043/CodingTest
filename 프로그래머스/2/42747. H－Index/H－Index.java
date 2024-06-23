class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for (int i = 0; i < 10000; i++) {
            int count = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i) {
                    count++;
                }
            }
            if (count >= i) {
                continue;
            } else {
                return i - 1;
            }
        }
        
        return answer;
    }
}