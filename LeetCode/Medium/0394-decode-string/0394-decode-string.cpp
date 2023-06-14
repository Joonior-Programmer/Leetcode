class Solution {
public:
    string decodeString(string s) {
        ::stack<string> stack;
        ::stack<int> repeat;
        int rp = 0;
        string cur = "";
        
        for(int i = 0; i < s.size(); ++i){
            if (isdigit(s[i])) rp = rp * 10 + (s[i] - '0');
            else if (s[i] == '[') {
                stack.push(cur);
                repeat.push(rp);
                cout << rp << endl;
                rp = 0;
                cur = "";
            } else if (s[i] == ']') {
                string temp = stack.top();
                cout << repeat.top() << endl;
                for (int i = 0; i < repeat.top(); ++i) temp += cur;
                
                stack.pop();
                repeat.pop();
                
                cur = temp;
            } else cur += s[i];
        }
        
        return cur;
    }
};