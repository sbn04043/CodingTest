import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> result = new ArrayList<>();
        
        Map<String ,String> userMap = new HashMap<>(); // id, 닉네임
        
        for (int i = 0; i < record.length; i++) {
            String[] user = record[i].split(" ");
            if (user[0].equals("Enter")) {
                userMap.put(user[1], user[2]);
            } else if (user[0].equals("Change")) {
                userMap.put(user[1], user[2]);
            }
        }
        
        for (int i = 0; i < record.length; i++) {
            String[] user = record[i].split(" ");
            if (user[0].equals("Enter")) {
                result.add(userMap.get(user[1]) + "님이 들어왔습니다.");
            } else if (user[0].equals("Change")) {
                
            } else { // Leave
                result.add(userMap.get(user[1]) + "님이 나갔습니다.");
            }
        }
        
        return result.toArray(new String[result.size()]);
    }
}