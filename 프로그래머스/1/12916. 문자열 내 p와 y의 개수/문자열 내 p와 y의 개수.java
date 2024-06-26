class Solution {
    boolean solution(String s) {
        char[] charArr = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        
        for (char c : charArr) {
            if (c == 'p' || c == 'P') {
                pCount++;
            } else if (c == 'y' || c == 'Y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}