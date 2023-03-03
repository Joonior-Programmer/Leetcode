class MyQueue {
public:
    vector<int> q;
    MyQueue() {
        
    }
    
    void push(int x) {
        q.push_back(x);
    }
    
    int pop() {
        int ret = q[0];
        q.erase(q.begin());
        return ret;
    }
    
    int peek() {
        return q[0];
    }
    
    bool empty() {
        return q.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */