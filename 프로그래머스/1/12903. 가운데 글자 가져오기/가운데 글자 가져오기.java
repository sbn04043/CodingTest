class Solution {
    public String solution(String s) {
        
        int len = s.length();
        return (len % 2 == 1) ? "" + s.charAt(len / 2) : "" + s.charAt(len / 2 - 1) + s.charAt(len / 2);
        
    }
}