class Solution {
public:
    int minOperations(vector<string>& logs) {
        int ret = 0;
        
        for (string log : logs){
            if (log[0] == '.') {
                if (log[1] == '.')
                    ret = max(0, ret - 1);
            }
            else ++ret;
        }
        
        return ret;
    }
};