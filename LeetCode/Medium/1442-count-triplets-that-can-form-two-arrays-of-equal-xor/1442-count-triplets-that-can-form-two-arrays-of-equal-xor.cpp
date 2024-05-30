class Solution {
public:
    int countTriplets(vector<int>& arr) {
        int n = arr.size();
        int ret = 0;
        
        for (int i = 0; i < n; ++i){
            int temp = arr[i];
            
            for (int j = i + 1; j < n; ++j){
                temp ^= arr[j];
                if (temp == 0) ret += j - i;
            }
        }
        
        return ret;
    }
};