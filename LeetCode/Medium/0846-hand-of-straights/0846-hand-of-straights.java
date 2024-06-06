class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);
        int n = hand.length;
        int i = 0;
        Map<Integer, Integer> count = new HashMap<>();

        while (i < n) {
            int val = hand[i];
            int temp = 0;
            while (i < n && val == hand[i]) {
                temp++;
                i++;
            }

            count.put(val, count.getOrDefault(val, 0) + temp);

            if (count.getOrDefault(val - groupSize + 1, 0) > 0) {
                int deduct = count.get(val - groupSize + 1);
                for (int j = val - groupSize + 1; j <= val; j++) {
                    count.put(j, count.getOrDefault(j, 0) - deduct);
                }
            }
        }

        for (int v : count.values()) {
            if (v != 0) {
                return false;
            }
        }

        return true;
    }
}