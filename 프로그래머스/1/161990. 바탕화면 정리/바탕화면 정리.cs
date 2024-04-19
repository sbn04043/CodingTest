using System;

public class Solution {
    public int[] solution(string[] wallpaper) {
        int[] answer = new int[4];
        int width = wallpaper[0].Length;
        int height = wallpaper.Length;
        int minH = 100, minW = 100, maxH = -1, maxW = -1;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (wallpaper[i][j] == '#') {
                    if (minH > i) minH = i;
                    if (minW > j) minW = j;
                    if (maxH < i) maxH = i;
                    if (maxW < j) maxW = j;
                }
            }
        }
        
        answer[0] = minH;
        answer[1] = minW;
        answer[2] = maxH + 1;
        answer[3] = maxW + 1;
        return answer; 
    }
}