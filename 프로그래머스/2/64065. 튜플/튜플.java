import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String s) {
        String str = s.substring(1, s.length() - 1);
        String[] strArr = str.split("}");
        
        strArr[0] = strArr[0].substring(1);
        for (int i = 1; i < strArr.length; i++) {
            strArr[i] = strArr[i].substring(2);
        }
        
        Map<Integer, Integer> tupleMap = new HashMap<>();
        for (String str2 : strArr) {
            String[] temp = str2.split(",");
            int[] intArr = new int[temp.length];
            
            for (int i = 0; i < temp.length; i++) {
                intArr[i] = Integer.parseInt(temp[i]);
            }
            
            for (int i = 0; i < intArr.length; i++) {
                if (tupleMap.containsKey(intArr[i])) {
                    tupleMap.put(intArr[i], tupleMap.get(intArr[i]) + 1);
                } else {
                    tupleMap.put(intArr[i], 1);
                }
            }
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(tupleMap.entrySet());
        entryList.sort((o1, o2) -> {
            return tupleMap.get(o2.getKey()) - tupleMap.get(o1.getKey());
        });
        
        int[] answer = new int[tupleMap.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = entryList.get(i).getKey();
        }
        
        
        return answer;
    }
}