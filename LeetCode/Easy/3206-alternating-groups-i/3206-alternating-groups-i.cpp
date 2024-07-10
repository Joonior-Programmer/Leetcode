class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& colors) {
        int n = colors.size();
        int ret = 0;
        
        for (int i = 1; i < n - 1; ++i) {
            int curr = colors[i];
            if (curr != colors[i-1] && curr != colors[i+1]) ++ret;
        }
        
        if (colors[0] != colors[n-1]) {
            if (colors[0] != colors[1]) ++ret;
            if (colors[n-1] != colors[n-2]) ++ret;
        }
    
        return ret;
    }
};