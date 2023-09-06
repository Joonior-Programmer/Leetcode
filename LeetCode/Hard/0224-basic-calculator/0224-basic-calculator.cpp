class Solution {
public:
    int calculate(string s) {
        int ret = 0;
        int op = 1;
        int temp = 0;
        stack<int> Stack;
        
        for (char v : s) {
            if (isdigit(v)) {
                temp = temp * 10 + (v - '0');
            }
            else if (v == '+' || v == '-') {
                ret += op * temp;
                temp = 0;
                op = v == '+' ? 1 : -1;
            }
            else if (v == '(') {
                Stack.push(ret);
                Stack.push(op);
                op = 1;
                ret = 0;
            }
            else if (v == ')') {
                ret += op * temp;
                ret *= Stack.top();
                Stack.pop();
                ret += Stack.top();
                Stack.pop();
                temp = 0;
            }
        }
        
        ret += op * temp;
        return ret;
    }
};