class Solution {
    public int solution(String s) {
        int answer = 0;
        int selectedCharNum = 0;
        int notSelectedCharNum = 0;
        char selectedChar = 0;
        
        char[] charArr = s.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            if (selectedCharNum == 0) {
                selectedChar = charArr[i];
                selectedCharNum++;
                continue;
            }
            
            if (charArr[i] == selectedChar) {
                selectedCharNum++;
            } else {
                notSelectedCharNum++;
            }
            
            if (selectedCharNum == notSelectedCharNum) {
                selectedCharNum = 0;
                notSelectedCharNum = 0;
                selectedChar = 0;
                answer++;
            }
        }
        
        if (selectedCharNum > 0) answer++;
        
        return answer;
    }
}