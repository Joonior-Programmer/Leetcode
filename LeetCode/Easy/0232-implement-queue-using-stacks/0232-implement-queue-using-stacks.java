class MyQueue {
    private ArrayList<Integer> q;
    public MyQueue() {
        q = new ArrayList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int ret = q.get(0);
        q.remove(0);
        return ret;
    }
    
    public int peek() {
        return q.get(0);
    }
    
    public boolean empty() {
        return q.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */