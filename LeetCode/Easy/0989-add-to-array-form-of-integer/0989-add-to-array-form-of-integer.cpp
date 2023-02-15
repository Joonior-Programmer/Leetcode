class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        int i = num.size() - 1;
        vector<int> ret;
        while (i > -1 || k){
            if (i > -1){
                k += num[i--];
            }
            ret.push_back(k % 10);
            k /= 10;
        }
        reverse(ret.begin(), ret.end());
        return ret;
    }
};