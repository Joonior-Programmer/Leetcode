class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        int minCost = Integer.MAX_VALUE;
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < costs.length; ++i){
            if (maxCost < costs[i]){
                maxCost = costs[i];
            }
            if (minCost > costs[i]){
                minCost = costs[i];
            }

            count.put(costs[i], count.getOrDefault(costs[i], 0) + 1);
        }

        int iceCreamBars = 0;
        for (int i = minCost; i < maxCost + 1; ++i){
            if (i > coins){
                break;
            }
            if (!count.containsKey(i)){
                continue;
            }
            
            int numOfCost = Math.min(count.get(i), coins / i);
            coins -= numOfCost * i;
            iceCreamBars += numOfCost;
        }
        return iceCreamBars;
    }
}