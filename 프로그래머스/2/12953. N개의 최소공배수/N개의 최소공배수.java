class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        int num = 1;
        
        int[] sosu = new int[25];
        int idx = 0;
        for (int i = 2; i < 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) sosu[idx++] = i;
        }

        for (int i = 1; i < arr.length; i++) {
            answer = calc(answer, arr[i], sosu);
        }
        
        
        return answer;
    }
    
    public int calc(int num1, int num2, int[] sosu) {
        int num = 1;
        for (int i = 0; i < sosu.length; i++) {
            if (num1 < sosu[i] || num2 < sosu[i]) break;
            
            if (num1 % sosu[i] == 0 && num2 % sosu[i] == 0) {
                num1 /= sosu[i];
                num2 /= sosu[i];
                num *= sosu[i];
                i--;
            }
        }
        return num1 * num2 * num;
    }
}