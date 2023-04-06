class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        const int size = nums.size()+1;
        bool *exist = new bool[size]{false};
        vector<int> ret;
        
        for (int i = 0; i < nums.size(); ++i) exist[nums[i]] = true;
        for (int i = 1; i < nums.size() + 1; ++i) {
            if (!exist[i]) ret.push_back(i);
        }
        delete[] exist;
        return ret;
    }
};