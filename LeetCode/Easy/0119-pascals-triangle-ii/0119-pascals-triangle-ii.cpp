class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> ret(1,1);
        for(int i = 1; i < rowIndex + 1; ++i){
            vector<int> temp = ret;
            for (int j = 1; j < i + 1; ++j){
                if (i == j){
                    ret.push_back(1);
                } else {
                    ret[j] += temp[j-1]; 
                }
            }
        }
        return ret;
    }
};