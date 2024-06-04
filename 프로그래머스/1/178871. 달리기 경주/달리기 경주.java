import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        System.arraycopy(players, 0, answer, 0, players.length);
        HashMap<String, Integer> ranking = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            ranking.put(players[i], i + 1);
        }
        
        for (String calling : callings) {
            int rank = ranking.get(calling);
            if (rank == 1) continue;
            
            ranking.replace(calling, rank - 1);
            String temp = answer[rank - 2];
            answer[rank - 2] = answer[rank - 1];
            answer[rank - 1] = temp;
            ranking.replace(temp, rank);
        }
        
        
        return answer;
    }
}