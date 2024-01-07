class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {
        int l = 0;
        int w = 0;
        
        for (vector<int>& v : dimensions){
            int original = l * l + w * w;
            int newArea = v[0] * v[0] + v[1] * v[1];
            
            if (newArea > original || (original == newArea && l * w < v[0] * v[1])){
                l = v[0];
                w = v[1];
            }
        }
        
        return l * w;
    }
};