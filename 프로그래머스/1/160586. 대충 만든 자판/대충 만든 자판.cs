using System;

public class Solution {
    public int[] solution(string[] keymap, string[] targets) {
        int[] answer = new int[targets.Length];
        for (int i = 0; i < targets.Length; i++) {
            answer[i] = 0;
        }
        
        int[] strAlpha = new int[26];
        for (int i = 0; i < 26; i++) {
            strAlpha[i] = 101;
        }
        
        for (int i = 0; i < keymap.Length; i++) {
            for (int j = 0; j < keymap[i].Length; j++) {
                if (strAlpha[keymap[i][j] - 'A'] > (j + 1))
                strAlpha[keymap[i][j] - 'A'] = (j + 1);
            }
        }
        
        for (int i = 0; i < targets.Length; i++) {
            for (int j = 0; j < targets[i].Length; j++) {
                if (strAlpha[targets[i][j] - 'A'] > 100) {
                    answer[i] = -1;
                    break;
                } 
                else
                    answer[i] += strAlpha[targets[i][j] - 'A'];
            }
        }
        
        
        return answer;
    }
}