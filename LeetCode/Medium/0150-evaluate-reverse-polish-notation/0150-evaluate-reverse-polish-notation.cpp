class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> container;
        unordered_set<string> operators;
        operators.insert("+");
        operators.insert("-");
        operators.insert("*");
        operators.insert("/");
        
        for (string v : tokens){
            if (operators.find(v) != operators.end()){
                int back = container.top();
                container.pop();
                int front = container.top();
                container.pop();
                
                if (v == "+") container.push(front + back);
                else if (v == "-") container.push(front - back);
                else if (v == "*") container.push(front * back);
                else container.push(front / back);
            } else container.push(stoi(v));
        }
        
        return container.top();
    }
};