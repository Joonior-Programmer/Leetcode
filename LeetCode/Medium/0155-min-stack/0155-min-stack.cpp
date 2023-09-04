class MinStack {
public:
    stack<int> container;
    stack<int> minContainer;
    
    MinStack() {
        minContainer.push(INT_MAX);
    }
    
    void push(int val) {
        container.push(val);
        minContainer.push(min(val, minContainer.top()));
    }
    
    void pop() {
        container.pop();
        minContainer.pop();
    }
    
    int top() {
        return container.top();
    }
    
    int getMin() {
        return minContainer.top();
    }
};



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */