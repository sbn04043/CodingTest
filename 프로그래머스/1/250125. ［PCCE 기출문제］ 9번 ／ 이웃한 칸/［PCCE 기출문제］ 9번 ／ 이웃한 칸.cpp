#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<vector<string>> board, int h, int w) {
    int answer = 0;
    int  dh[4] = {0, 1, -1, 0};
    int  dw[4] = {1, 0, 0, -1};
    string color = board[h][w];
    
    for (int i = 0; i < 4; i++)
    {
        if(h + dh[i] < 0 
          || h + dh[i] >= board.size()
          || w + dw[i] < 0
          || w + dw[i] >= board.size())
            continue;
        if(color == board[h + dh[i]][w + dw[i]])
            answer++;
    }
    
    return answer;
}