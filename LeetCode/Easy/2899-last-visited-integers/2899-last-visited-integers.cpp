class Solution {
public:
    vector<int> lastVisitedIntegers(vector<int>& nums) {
        list<int> seen;
        vector<int> ret;
        int k = 0;
        
        for (int v : nums){
            if (v != -1){
                seen.push_front(v);
                k = 0;
            } else {
                ++k;
                
                if (k > seen.size()) ret.push_back(-1);
                else {
                    list<int>::iterator iter = seen.begin();
                    std::advance(iter, k - 1);
                    ret.push_back(*iter);
                }
            }
        }
        
        return ret;
    }
};