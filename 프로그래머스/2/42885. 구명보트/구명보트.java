import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        
        while(i < j) {
            if (people[i] + people[j] <= limit) {
                count++;
                i++;
                j--;
            } else {
                j--;
            }
        }
        
        return people.length - count;
    }
}