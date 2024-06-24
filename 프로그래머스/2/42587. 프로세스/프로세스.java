class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        int[] index = new int[10];
        for (int i = 0; i < priorities.length; i++) {
            index[priorities[i]]++;
        }
        int i = 9;
        int j = 0;
        while(i > 0) {
            while(index[i] == 0) {
                i--;
            }
            if (priorities[j] == i) {
                answer++;
                if (j == location)
                    return answer - 1;
                index[i]--;
                
            }
            j++;
            if (j >= priorities.length) {
                j %= priorities.length;
            }
        }
        return answer - 1;
    }
}