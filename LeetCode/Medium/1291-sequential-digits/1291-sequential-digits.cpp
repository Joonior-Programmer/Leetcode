class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> ret(0);
        
        for (int i = 1; i < 10; ++i){
            int j = i + 1;
            int temp = i;
            
            while (j < 10 && temp < high){
                temp = (temp * 10) + j;
                ++j;
                
                if (temp >= low && temp <= high) ret.push_back(temp);
            }
        }
        
        sort(ret.begin(), ret.end());
        
        return ret;
    }
};