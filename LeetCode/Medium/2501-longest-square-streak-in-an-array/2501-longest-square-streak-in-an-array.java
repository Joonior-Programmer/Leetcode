class Solution {
    public int longestSquareStreak(int[] nums) {
        int maxNum = 100000;
        boolean[] numSet = new boolean[maxNum + 1];

        for (int num : nums) {
            if (num <= maxNum) {
                numSet[num] = true;
            }
        }

        Arrays.sort(nums);
        int maxStreak = 0;

        for (int num : nums) {
            if (!numSet[num]) continue;
            
            int curr = num;
            int streakLength = 0;

            while (curr <= maxNum && numSet[curr]) {
                streakLength++;
                numSet[curr] = false;

                if (curr > 316) break;
                curr *= curr;
            }

            maxStreak = Math.max(maxStreak, streakLength);
        }

        return maxStreak < 2 ? -1 : maxStreak;
    }
}