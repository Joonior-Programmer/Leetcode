class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        vector<int> count(201);
        vector<vector<int>> ret;
        
        for (int num : nums) {
            if (count[num] == ret.size()) ret.push_back(vector<int>());
            ret[count[num]].push_back(num);
            ++count[num];
        }
        
        return ret;
    }
};