import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        int copy = n;
        while(copy > 1) {
            if (copy % 2 == 0) {
                copy /= 2;
            } else {
                copy -= 1;
                ans++;
            }
            
        }
        if (copy == 1)
            ans++;

        return ans;
    }
}