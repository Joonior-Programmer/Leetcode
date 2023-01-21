class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int len = digits.size(), counter;
        for (int i = len - 1; i > -1; i--){
            if (digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        vector<int> result;
        result.push_back(1);
        for (int i = 0; i < len; ++i)
            result.push_back(0);
        
        return result;
    }
};