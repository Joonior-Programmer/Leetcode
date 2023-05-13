class Solution {
    public int distributeCandies(int[] candyType) {
        int[] count = new int[200001];
        int distinct = 0;
        for (int i = 0; i < candyType.length; ++i) {
            if (count[candyType[i] + 100000] == 0){
                ++count[candyType[i] + 100000];
                ++distinct;
            }
        }
        return Math.min(candyType.length / 2, distinct);
    }
}