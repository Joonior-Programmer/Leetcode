class Solution {
public:
    void reverseString(vector<char>& s) {
        int length = s.size();
        for(int i = 0; i < length / 2; ++i){
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
    }
};