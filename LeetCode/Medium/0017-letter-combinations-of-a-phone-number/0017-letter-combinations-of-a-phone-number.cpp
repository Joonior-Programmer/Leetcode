class Solution {
public:
    vector<vector<char>> dial = {
        {'a','b','c'}, {'d','e','f'}, {'g','h','i'}, {'j','k','l'},
        {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}
    };
    vector<string> ret;
    string digits;
    int n;
    
    vector<string> letterCombinations(string digits) {
        this->digits = digits;
        n = digits.size();
        if (n > 0) DFS("", 0);
        return ret;
    }
    
    void DFS(string curr, int idx){
        if (idx == n){
            ret.push_back(curr);
            return;
        }
        
        for (int i = 0; i < dial[digits[idx] - '2'].size(); ++i){
            DFS(curr + dial[digits[idx]-'2'][i], idx + 1);
        }
    }
};