import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] check = new boolean[words.length];
        
        Queue<String> wordQ = new LinkedList<String>();
        wordQ.add(begin);
        
        while(!wordQ.isEmpty()) {
            answer++;
            Queue<String> tempQ = new LinkedList<String>();
            while(!wordQ.isEmpty()) {
                tempQ.add(wordQ.remove());
            }
            
            while(!tempQ.isEmpty()) {
                String str = tempQ.remove();
                //System.out.println(str);
                
                for (int i = 0; i < words.length; i++) {
                    int neqAlphabet = 0;
                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(j) != words[i].charAt(j)) {
                            neqAlphabet++;
                        }
                    }
                    
                    if (neqAlphabet == 1 && check[i] == false) {
                        if (words[i].equals(target)) {
                            return answer;
                        }
                        wordQ.add(words[i]);
                        check[i] = true;
                    }
                }
            }
            
        }
        return 0;
    }
}