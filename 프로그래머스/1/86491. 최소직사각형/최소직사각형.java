class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int height = 0;
        int width = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int h, w;
            if (sizes[i][0] > sizes[i][1]) {
                h = sizes[i][0];
                w = sizes[i][1];
            } else {
                h = sizes[i][1];
                w = sizes[i][0];
            }
            
            if (height < h)
                height = h;
            if (width < w) 
                width = w;
        }
        
        
        return width * height;
    }
}