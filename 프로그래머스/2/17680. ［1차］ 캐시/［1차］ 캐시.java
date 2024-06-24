import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return 5 * cities.length;
        
        LinkedList<String> cache = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
        }
        
        for (String city : cities) {
            if (cache.contains(city)) {
                answer++;
                cache.remove(city);
                cache.add(city);
            } else {
                answer += 5;
                if (cache.size() == cacheSize) {
                    cache.remove();
                    cache.add(city);
                } else {
                    cache.add(city);
                }
            }
        }
        
        return answer;
    }
}