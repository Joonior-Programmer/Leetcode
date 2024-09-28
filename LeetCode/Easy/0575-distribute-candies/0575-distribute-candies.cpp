class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        std::ios::sync_with_stdio(false);
        std::cin.tie(nullptr);

        int count[200001]{0};
        int distinct = 0;
        int length = 0;
        for (int i = 0; i < candyType.size(); ++i) {
            if (count[candyType[i] + 100000] == 0){
                ++count[candyType[i] + 100000];
                ++distinct;
            }
            ++length;
        }
        return min(length / 2, distinct);
    }
};