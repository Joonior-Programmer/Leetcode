class Solution {
public:
    vector<int> prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ret;
        unordered_map<long, vector<string>> temp;
        
        for (int i = 0; i < strs.size(); ++i){
            long hash = 1;
            
            for (int j = 0; j < strs[i].size(); ++j) hash = hash * prime[strs[i][j] - 'a'] % 10000000007L;
            
            if (temp.find(hash) == temp.end()) temp[hash] = vector<string>{};
            temp[hash].push_back(strs[i]);
        }
        
        for (auto& it : temp) ret.push_back(it.second);
        
        return ret;
    }
};