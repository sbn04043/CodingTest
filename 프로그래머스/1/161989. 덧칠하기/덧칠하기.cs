using System;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int temp = 0;

        if(section.Length == 0) return 0;
        
        while(true) {
            answer++;
            int num = section[temp] + m - 1;
            if (num >= section[section.Length - 1]) return answer;
            
            for (int i = 0; i < section.Length; i++) {
                if (section[i] > num) {
                    temp = i;
                    break;
                }
            }
                
        }
        
        return answer;
    }
}