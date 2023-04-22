class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        int length = score.size();
        vector<string> ret;
        vector<int> sortedScore = score;
        sort(sortedScore.begin(), sortedScore.end());
        unordered_map<int, string> ranks;
        
        int j = 1;
        for (int i = length - 1; i > -1; i--){
            ranks[sortedScore[i]] = j == 1 ? "Gold Medal" : 
                                    j == 2 ? "Silver Medal" :
                                    j == 3 ? "Bronze Medal" : 
                                              to_string(j);
            ++j;
        }

        for (int i = 0; i < length; ++i) ret.push_back(ranks[score[i]]);
        
        return ret;
    }
};