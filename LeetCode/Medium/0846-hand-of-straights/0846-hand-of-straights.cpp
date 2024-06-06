class Solution {
public:
    bool isNStraightHand(vector<int>& hand, int groupSize) {
        ios::sync_with_stdio(false); cin.tie(nullptr); cout.tie(nullptr);
        if (hand.size() % groupSize != 0) {
            return false;
        }

        sort(hand.begin(), hand.end());
        int n = hand.size();
        int i = 0;
        unordered_map<int, int> count;

        while (i < n) {
            int val = hand[i];
            int temp = 0;
            while (i < n && val == hand[i]) {
                temp++;
                i++;
            }

            count[val] += temp;

            if (count[val - groupSize + 1] > 0) {
                int deduct = count[val - groupSize + 1];
                for (int j = val - groupSize + 1; j <= val; j++) {
                    count[j] -= deduct;
                }
            }
        }

        for (const auto& kv : count) {
            if (kv.second != 0) {
                return false;
            }
        }

        return true;
    }
};