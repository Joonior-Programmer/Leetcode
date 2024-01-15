class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
        unordered_map<int, int> count;
        vector<vector<int>> ret(2, vector<int>(0));
        
        for (int i = 0; i < matches.size(); ++i){
            if (count.find(matches[i][0]) == count.end()) count[matches[i][0]] = 0;
            
            if (count.find(matches[i][1]) == count.end()) 
                count[matches[i][1]] = 1;
            else ++count[matches[i][1]];
        }
        
        for (auto& it: count) {
            if (it.second == 0) ret[0].push_back(it.first);
            if (it.second == 1) ret[1].push_back(it.first);
        }
                
        sort(ret[0].begin(), ret[0].end());
        sort(ret[1].begin(), ret[1].end());
        
        return ret;
    }
};