class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        sort(arr.begin(), arr.end());
        int min = INT_MAX;
        vector<vector<int>> ret;
        
        for (int i = 1; i < arr.size(); ++i){
            int temp = abs(arr[i] - arr[i-1]);
            if (temp < min){
                min = temp;
                ret.clear();
                ret.push_back(vector<int>{arr[i-1], arr[i]});
            } else if (temp == min) 
                ret.push_back(vector<int>{arr[i-1], arr[i]});
        }
        
        return ret;
    }
};