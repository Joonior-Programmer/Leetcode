class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        int n = arr.size();
        unordered_map<int, int> map;
        vector<int> count(n+1);
        int ret = 0;
        
        for (int i = 0; i < n; ++i) {
            if (map.find(arr[i]) == map.end()) map[arr[i]] = 1;
            else ++map[arr[i]];
        }
        
        for (pair<int,int> v : map) {
            ++ret;
            ++count[v.second];
        }
        
        int i = 1;
        
        while (k > 0){
            if (count[i] > 0){
                count[i]--;
                ret--;
                k -= i;
            } else ++i;
        }
        
        if (k < 0) return ret + 1;
        return ret;
    }
};