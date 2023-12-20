class Solution {
    public int buyChoco(int[] prices, int money) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int price : prices){
            if (price <= first){
                second = first;
                first = price;
            } else if (price <= second) second = price;
        }
        
        if (first + second > money) return money;
        
        return money - first - second;
    }
}