class Solution {
public:
    string reverseStr(string s, int k) {
        string ret = "";
        int i = 0;
        string temp;
        while (i < s.length()){
            temp = "";
            temp += s.substr(i, i+k < s.length() ? k : s.length() % k == 0 ? k : s.length() % k);
            reverse(temp.begin(), temp.end());
            ret += temp;
            if (i+k > s.length()) break;
            if (i+k+k < s.length()){
                ret += s.substr(i+k,k);
            } else {
                ret += s.substr(i+k, s.length() % k == 0 ? k : s.length() % k);
            }
            i += k * 2;
        }
        return ret;
    }
};