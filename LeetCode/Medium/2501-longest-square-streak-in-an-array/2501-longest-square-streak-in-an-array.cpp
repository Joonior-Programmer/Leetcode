class Solution {
public:
    int longestSquareStreak(vector<int>& nums) {
        std::ios_base::sync_with_stdio(false);
        std::cin.tie(0);
        
        int maxNum = 100000;
        vector<bool> numSet(maxNum + 1, false);

        for (int num : nums) {
            if (num <= maxNum) {
                numSet[num] = true;
            }
        }

        sort(nums.begin(), nums.end());
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

            maxStreak = max(maxStreak, streakLength);
        }

        return maxStreak < 2 ? -1 : maxStreak;
    }
};