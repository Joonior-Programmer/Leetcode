class Solution {
public:
    int countOdds(int low, int high) {
        return (high - low) / 2 + (low % 2 == 1 || high % 2 == 1);
    }
};