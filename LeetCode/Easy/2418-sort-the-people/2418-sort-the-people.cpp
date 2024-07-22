class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        int n = names.size();
        for (int i = 0; i < n; ++i){
            int idx = i;
            for (int j = i; j < n; ++j)
                if (heights[idx] < heights[j]) idx = j;
            
            string tempName = names[i];
            names[i] = names[idx];
            names[idx] = tempName;
            
            int tempHeight = heights[i];
            heights[i] = heights[idx];
            heights[idx] = tempHeight;
        }
        
        return names;
    }
};