import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int lostIndex = 0, reserveIndex = 0;
        while (lostIndex < lost.length && reserveIndex < reserve.length) {
            if (lost[lostIndex] == reserve[reserveIndex]) {
                lost[lostIndex] = -1;
                reserve[reserveIndex] = -1;
                lostIndex++;
                reserveIndex++;
            } else if (lost[lostIndex] > reserve[reserveIndex]) {
                reserveIndex++;
            } else {
                lostIndex++;
            }
        }
        
        lostIndex = 0;
        reserveIndex = 0;
        while (lostIndex < lost.length && reserveIndex < reserve.length) {
            if (lost[lostIndex] == -1 && reserve[reserveIndex] == -1) {
                lostIndex++;
                reserveIndex++;
                continue;
            } else if (lost[lostIndex] == -1) {
                lostIndex++;
                continue;
            } else if (reserve[reserveIndex] == -1) {
                reserveIndex++;
                continue;
            }
            
            if (reserve[reserveIndex] >= lost[lostIndex] - 1 &&
                reserve[reserveIndex] <= lost[lostIndex] + 1) {
                lost[lostIndex] = -1;
                reserveIndex++;
                lostIndex++;
            } else if (lost[lostIndex] > reserve[reserveIndex]) {
                reserveIndex++;
            } else {
                lostIndex++;
            }
        }
        
        int num = 0;
        for (int i = 0; i < lost.length; i++) {
            System.out.print(lost[i] + " ");
            if (lost[i] != -1)
                num++;
        }
        
        return n - num;
    }
}