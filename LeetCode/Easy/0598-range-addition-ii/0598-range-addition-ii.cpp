class Solution {
public:
    int maxCount(int m, int n, vector<vector<int>>& ops) {
        int x = m;
        int y = n;
        
        for (int i = 0; i < ops.size(); ++i){
            if (ops[i][0] < x) x = ops[i][0];
            if (ops[i][1] < y) y = ops[i][1];
        }
        
        return x * y;
    }
};