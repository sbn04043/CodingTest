import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<MyNumber> queue = new LinkedList<>();
        
        queue.add(new MyNumber(y, 0));
        
        while(!queue.isEmpty()) {
            MyNumber myNumber = queue.remove();
            int num = myNumber.num;
            int epoch = myNumber.epoch;
            
            if (num == x) {
                return epoch;
            }
            
            if (num % 3 == 0 && num / 3 >= x) {
                queue.add(new MyNumber(num / 3, epoch + 1));
            }
            
            if (num % 2 == 0 && num / 2 >= x) {
                queue.add(new MyNumber(num / 2, epoch + 1));
            }
            
            if (num - n >= x) {
                queue.add(new MyNumber(num - n, epoch + 1));
            }
        }
        return -1;
    }
    
    class MyNumber {
        int num;
        int epoch;
        
        public MyNumber(int num, int epoch) {
            this.num = num;
            this.epoch = epoch;
        }
    }
}