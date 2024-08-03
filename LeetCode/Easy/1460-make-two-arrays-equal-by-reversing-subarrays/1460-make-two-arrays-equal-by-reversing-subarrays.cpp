class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        int n = target.size();
        vector<int> a(1001);
        vector<int> b(1001);
        
        for (int i = 0; i < n; ++i){
            ++a[target[i]];
            ++b[arr[i]];
        }
        
        for (int i = 1; i < 1001; ++i)
            if (a[i] != b[i])
                return false;
        
        return true;
    }
};