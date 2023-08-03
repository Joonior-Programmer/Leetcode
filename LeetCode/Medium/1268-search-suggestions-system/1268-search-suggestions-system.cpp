class Solution {
public:
    vector<vector<string>> suggestedProducts(vector<string>& products, string searchWord) {
        int n = products.size();
        int m = searchWord.size();
        vector<vector<string>> ret(m);
        int l = 0, r = n - 1;
        sort(products.begin(), products.end());
        
        for (int i = 0; i < searchWord.size(); ++i){
            while (l <= r && (i >= products[l].size() || products[l][i] != searchWord[i])) ++l;
            while (l <= r && (i >= products[r].size() || products[r][i] != searchWord[i])) r--;
            
            vector<string> temp;
            for (int j = l; j < min(l+3, r+1); ++j) temp.push_back(products[j]);
            
            ret[i] = temp;
        }
        
        return ret;
    }
};