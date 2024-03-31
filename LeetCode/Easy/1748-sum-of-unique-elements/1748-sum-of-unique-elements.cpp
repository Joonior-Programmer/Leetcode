class Solution {
public:
    int sumOfUnique(vector<int>& nums) {
        vector<int> count(101);
        int ret = 0;
        
        for (int v : nums)
            ++count[v];

        for (int i = 1; i < 101; ++i)
            if (count[i] == 1)
                ret += i;

        return ret;
    }
};