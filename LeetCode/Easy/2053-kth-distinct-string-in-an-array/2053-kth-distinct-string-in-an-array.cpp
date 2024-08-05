class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {
        unordered_map<string, int> count;
        
        
        for (string v : arr)
            if (count.find(v) != count.end()) ++count[v];
            else count[v] = 1;
        
        for (string v : arr) 
            if (count[v] == 1) {
                k--;
                if (k == 0) return v;
            }
        
        return "";
    }
};