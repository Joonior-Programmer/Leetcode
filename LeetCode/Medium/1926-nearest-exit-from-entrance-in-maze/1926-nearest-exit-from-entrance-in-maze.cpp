class Solution {
public:
    int nearestExit(vector<vector<char>>& maze, vector<int>& entrance) {
        ios_base::sync_with_stdio(0);
        cin.tie(NULL);
        cout.tie(NULL);
        
        int x = entrance[0];
        int y = entrance[1];
        int ret = -1;
        int temp = 0;
        
        vector<pair<int, int>> q;
        
        int rowLen = maze.size() - 1;
        int colLen = maze[0].size() - 1;
        
        for (int i = 0; i < rowLen + 1; ++i){
            if (maze[i][0] == '.' && (i != x || 0 != y)){
                q.push_back(make_pair(i, 0));
                maze[i][0] = '+';
            }
            if (maze[i][colLen] == '.' && (i != x || colLen != y)){
                q.push_back(make_pair(i, colLen));
                maze[i][colLen] = '+';
            }
        }
        
        for (int i = 0; i < colLen; ++i){
            if (maze[0][i] == '.' && (0 != x || i != y)){
                q.push_back(make_pair(0, i));
                maze[0][i] = '+';
            }
            if (maze[rowLen][i] == '.' && (rowLen != x || i != y)){
                q.push_back(make_pair(rowLen, i));
                maze[rowLen][i] = '+';
            }
        }
        
        int i = 0;
        while (ret == -1 && !q.empty()){
            vector<pair<int,int>> tempQ;
            
            while (!q.empty()){
                pair<int, int> coord = q.back();
                q.pop_back();

                if (coord.first == x && coord.second == y){
                    ret = temp;
                    break;
                }
                
                if (coord.first > 0 && maze[coord.first - 1][coord.second] == '.'){
                    tempQ.push_back(make_pair(coord.first-1, coord.second));
                    maze[coord.first-1][coord.second] = '+';
                }
                if (coord.first < rowLen && maze[coord.first + 1][coord.second] == '.'){
                    tempQ.push_back(make_pair(coord.first+1, coord.second));
                    maze[coord.first+1][coord.second] = '+';
                }
                if (coord.second > 0 && maze[coord.first][coord.second - 1] == '.'){
                    tempQ.push_back(make_pair(coord.first, coord.second-1));
                    maze[coord.first][coord.second-1] = '+';
                }
                if (coord.second < colLen && maze[coord.first][coord.second + 1] == '.'){
                    tempQ.push_back(make_pair(coord.first, coord.second+1));
                    maze[coord.first][coord.second+1] = '+';
                }
            }
            ++temp;
            q = tempQ;
        }
        
        return ret;
    }
};