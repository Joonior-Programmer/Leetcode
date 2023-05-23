class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        int count[2000]{0};
        int ret[1001]{0};
        
        for (int i = 0; i < arr.size(); ++i) ++count[arr[i] + 1000];

        for (int i = 0; i < 2000; ++i){
            if (count[i] == 0) continue;
            if (ret[count[i]] != 0) return false;
            ++ret[count[i]];
        }
        return true;
    }
};