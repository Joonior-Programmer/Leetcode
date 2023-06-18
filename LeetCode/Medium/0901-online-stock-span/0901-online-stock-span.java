class StockSpanner {
    Stack<Integer[]> stack = new Stack<>();
    
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int days = 1;
        
        while (!stack.isEmpty() && stack.peek()[0] <= price){
            days += stack.pop()[1];
        }
        
        Integer[] next = {price, days};
        stack.push(next);
        return days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */