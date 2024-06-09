class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c == ' ') {
                answer += ' ';
            } else if (c >= 'a' && c <= 'z') {
                int temp = c + n;
                if (temp > 'z') {
                    temp -= 26;
                }
                answer += (char)temp;
            } else if (c >= 'A' && c <= 'Z') {
                int temp = c + (char)n;
                if (temp > 'Z') {
                    temp -= 26;
                }
                answer += (char)temp;
            }
        }
    
        return answer;
    }
}