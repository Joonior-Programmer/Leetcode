class StockSpanner {
public:
    stack<pair<int, int>> ret;
    StockSpanner() {
    }
    
    int next(int price) {
        int days = 1;
        
        while (!ret.empty() && ret.top().first <= price){
            days += ret.top().second;
            ret.pop();
        }
        
        ret.push({price, days});
        return days;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */