class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String copyS = new String(s);
        
        while(!copyS.equals("1")) {
            int count = 0;
            for (int i = 0; i < copyS.length(); i++) {
                if (copyS.charAt(i) == '1') count++;
                else answer[1]++;
            }
            
            copyS = intToBit(count);
            answer[0]++;
        }
        return answer;
    }
    
    public String intToBit(int n) {
        String result = "";
        while(n > 0) {
            result += n % 2;
            n /= 2;
        }
        return result;
    }
}