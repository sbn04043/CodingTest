import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        //장르 -> 플레이수
        Map<String, Integer> genreMap = new HashMap<>();
        //장르 -> <플레이 리스트(index, plays)>
        Map<String, List<Play>> playMap = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            if (playMap.containsKey(genres[i])) {
                genreMap.put(genres[i], genreMap.get(genres[i]) + plays[i]);
                
                List<Play> tempList = playMap.get(genres[i]);
                tempList = playMap.get(genres[i]);
                tempList.add(new Play(i, plays[i]));
                
            } else {
                genreMap.put(genres[i], plays[i]);
                
                List<Play> tempList = new ArrayList<>();
                tempList.add(new Play(i, plays[i]));
                playMap.put(genres[i], tempList);
            }
        }
        
        List<String> keySet = new ArrayList<>(genreMap.keySet());
        keySet.sort((o1, o2) -> genreMap.get(o2).compareTo(genreMap.get(o1)));
        
        List<Integer> answerList = new ArrayList<>();
        
        for (String key : keySet) {
            List<Play> tempList = playMap.get(key);
            Collections.sort(tempList, Collections.reverseOrder());
            
            answerList.add(tempList.get(0).index);
            if (tempList.size() > 1) {
                answerList.add(tempList.get(1).index);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
    
    class Play implements Comparable {
        int index;
        int plays;
        
        public Play(int index, int plays) {
            this.index = index;
            this.plays = plays;
        }
        
        @Override
        public int compareTo(Object o) {
            Play play = (Play) o;
            if (this.plays >= play.plays) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}