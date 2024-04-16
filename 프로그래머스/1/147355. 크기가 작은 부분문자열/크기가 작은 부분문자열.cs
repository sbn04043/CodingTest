using System;

public class Solution {
    public int solution(string t, string p) {
        int answer = 0;
        
        int pSize = p.Length;
        int epoch = t.Length - pSize + 1;
        bool flag = true;
        
        for (int i = 0; i < epoch; i++) {
            flag = true;
            for (int j = 0; j < pSize; j++) {
                if (t[i + j] > p[j]) {
                    Console.WriteLine("{0}, {1}", i, j);
                    flag = false;
                    break;
                }
                
                if (t[i + j] > p[j]) {
                    flag = false;
                    break;
                }
                else if (t[i + j] < p[j]) {
                    flag = true;
                    break;
                }
                    
            }
            if (flag)
                answer++;
        }
        
        
        return answer;
    }
}