class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int n = arr.size();
        float target = n / 4;
        int curr = arr[0];
        int count = 1;
        
        for (int i = 1; i < n; ++i){
            if (curr == arr[i]) ++count;
            else {
                count = 1;
                curr = arr[i];
            }
            
            if (count > target) break;
        }
        
        return curr;
    }
};