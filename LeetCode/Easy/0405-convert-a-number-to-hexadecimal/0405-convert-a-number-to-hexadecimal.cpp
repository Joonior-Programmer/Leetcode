class Solution {
public:
    string toHex(int num) {
        if (!num) return "0";
        char hex[]{'0', '1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        stringstream ss;
        while (num != 0 && ss.tellp() != 8){
            ss << hex[num & 15];
            num >>= 4;
        }
        string ret = ss.str();
        reverse(ret.begin(), ret.end());
        return ret;
    }
};