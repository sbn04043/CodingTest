using System;

public class Solution {
    public string solution(string[] cards1, string[] cards2, string[] goal) {
        string answer = "";
        int cardNum1 = 0;
        int cardNum2 = 0;
        
        for (int i = 0; i < goal.Length; i++) {
            if (cardNum1 < cards1.Length) {
                if (string.Equals(goal[i], cards1[cardNum1])) {
                    cardNum1++;
                    continue;
                }
            }
            if (cardNum2 < cards2.Length) {
                if (string.Equals(goal[i], cards2[cardNum2])) {
                    cardNum2++;
                    continue;
                }
            }
            return "No";
        }
        return "Yes";
    }
}