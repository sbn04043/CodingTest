using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(string s) {
        int[] answer = new int[s.Length];
        int[] arr = new int[26];
        
        Console.WriteLine(s.Length);
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < s.Length; i++) {
            if (arr[s[i] - 'a'] == -1) {
                answer[i] = -1;
                arr[s[i] - 'a'] = i;
            }
            else {
                answer[i] = i - arr[s[i] - 'a'];
                arr[s[i] - 'a'] = i;
            }
        }
        
        
        return answer;
    }
}