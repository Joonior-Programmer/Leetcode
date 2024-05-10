class Solution {
public:
    int findLucky(vector<int>& arr) {
        int n = arr.size();
        vector<int> count(501);
        
        for (int v : arr) ++count[v];
        
        for (int i = n; i > 0; i--)
            if (count[i] == i) return i;
        
        return -1;
    }
};