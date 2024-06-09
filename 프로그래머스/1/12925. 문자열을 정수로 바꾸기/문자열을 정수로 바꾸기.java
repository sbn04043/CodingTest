import java.lang.Math;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        int answer = 0;
        int buho = 1;
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+' ) {
                n = 1;
            } else if (arr[i] == '-') {
                buho = -1;
                n = 1;
            } else {
                int temp = (arr[i] - '0') * (int)Math.pow(10, arr.length - n - i);
                answer += temp;
            }
        }
        
        return answer * buho;
    }
}