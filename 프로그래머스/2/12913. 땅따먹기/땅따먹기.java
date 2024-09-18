class Solution {
    int solution(int[][] land) {
        int answer = 0;

        int[][] myLand = new int[land.length][4];
        for (int i = 0; i < 4; i++) {
            myLand[0][i] = land[0][i];
        }
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;
                    myLand[i][j] = Math.max(myLand[i][j], land[i][j]  + myLand[i - 1][k]);
                }
            }
        }
        
        // for (int i = 0; i < land.length; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(myLand[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        answer = Math.max(Math.max(myLand[land.length - 1][0], myLand[land.length - 1][1]),
                          Math.max(myLand[land.length - 1][2], myLand[land.length - 1][3]));
        

        return answer;
    }
}