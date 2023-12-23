class Solution {
public:
    bool isPathCrossing(string path) {
        set<vector<int>> visited;
        int x = 0;
        int y = 0;
        visited.insert({x, y});

        for (char v : path) {
            if (v == 'N') ++x;
            else if (v == 'S') x--;
            else if (v == 'E') ++y;
            else y--;

            if (visited.find({x,y}) != visited.end()) return true;

            visited.insert({x, y});
        }

        return false;
    }
};
