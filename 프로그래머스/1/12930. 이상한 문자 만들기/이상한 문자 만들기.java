class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        int start = 0;
        int compare = 'a' - 'A';
        
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                answer += ' ';
                start = 0;
                continue;
            }
            
            if (start % 2 == 0) {
                if (charArr[i] >= 'a' && charArr[i] <= 'z')
                    charArr[i] -= compare;
                answer += charArr[i];
            } else {
                if (charArr[i] >= 'A' && charArr[i] <= 'Z') 
                    charArr[i] += compare;
                answer += charArr[i];
            }
            start++;
        }
        return answer;
    }
}