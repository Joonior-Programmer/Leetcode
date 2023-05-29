class Solution {
public:
    string reverseWords(string s) {
        vector<string> ret;
        int left = 0;
        int right = 0;
        string result = "";

        while (right < s.size()){
            while (left < s.size() && s[left] == ' ') ++left;
            
            right = left;
            while (right < s.size() && s[right] != ' ') ++ right;
            if (left != right){
                ret.push_back(s.substr(left, right - left));
                ++right;
                left = right;
            }
        }
        reverse(ret.begin(), ret.end());

        for (int i = 0; i < ret.size() -1; ++i) result += ret[i] + " ";
        result += ret[ret.size()-1];

        return result;
    }
};