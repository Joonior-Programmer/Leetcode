class Solution {
public:
    int i = 0;
    int n;
    vector<char> ret;
    string s;
    
    string reverseParentheses(string s) {
        n = s.length();
        this->s = s;
        
        helper(0);
        
        string result = "";
        
        for (int i = 0; i < ret.size(); ++i) result += ret[i];
        
        return result;
    }
    
    void helper(int start){
        while (i < n){
            if (s[i] == '(') {
                i++;
                helper(ret.size());
            }
            else if (s[i] == ')') {
                i++;
                rev(start, ret.size()-1);
                return;
            }
            else {
                ret.push_back(s[i++]);
            }
        }
    }
    
    void rev(int l, int r){
        // cout << l << ", " << r << endl;
        while (l < r){
            char temp = ret[l];
            ret[l] = ret[r];
            ret[r] = temp;
            l++;
            r--;
        }
    }
};