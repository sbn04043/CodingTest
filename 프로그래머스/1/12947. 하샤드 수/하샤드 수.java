class Solution {
    public boolean solution(int x) {
        int hashard = 0;
        int copy = x;
        for (int i = 0; i < 4; i++) {
            hashard += copy % 10;
            copy /= 10;
        }
        
        return (x % hashard == 0)? true : false;
    }
}