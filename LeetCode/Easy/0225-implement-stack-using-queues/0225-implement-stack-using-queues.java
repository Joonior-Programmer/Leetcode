class MyStack {
    Queue<Integer> q;
    public MyStack() {
        this.q = new LinkedList<>();
    }
    
    public void push(int x) {
        this.q.add(x);
    }
    
    public int pop() {
        Queue<Integer> q = new LinkedList<>();
        int size = this.q.size()-1;
        for (int i = 0; i < size; ++i){
            q.add(this.q.poll());
        }
        int ret = this.q.poll();
        this.q = q;
        return ret;
    }
    
    public int top() {
        Queue<Integer> q = new LinkedList<>(); 
        int size = this.q.size()-1;
        for (int i = 0; i < size; ++i){
            q.add(this.q.poll());
        }

        int ret = this.q.poll();
        q.add(ret);
        this.q = q;
        return ret;
    }
    
    public boolean empty() {
        return this.q.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */