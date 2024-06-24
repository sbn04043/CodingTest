class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        for (int i = triangle.length - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                int left = triangle[i - 1][j - 1] + triangle[i][j - 1];
                int right = triangle[i - 1][j - 1] + triangle[i][j];
                
                if (left > right) triangle[i - 1][j - 1] = left;
                else triangle[i - 1][j - 1] = right;
            }
        }
        return triangle[0][0];
    }
}