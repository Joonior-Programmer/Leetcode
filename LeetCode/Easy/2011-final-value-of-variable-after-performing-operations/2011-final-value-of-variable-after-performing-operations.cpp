class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int ret = 0;
        
        for (string v : operations){
            if (v[0] == '+' || v[2] == '+') ++ret;
            else ret--;
        }
        
        return ret;
    }
};