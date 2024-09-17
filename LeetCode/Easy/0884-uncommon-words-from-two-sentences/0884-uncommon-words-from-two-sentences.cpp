class Solution {
public:
    vector<string> uncommonFromSentences(string s1, string s2) {
        unordered_map<string, int> count;
        vector<string> result;
        
        auto splitAndCount = [&count](const string& s) {
            istringstream iss(s);
            string word;
            while (iss >> word) {
                ++count[word];
            }
        };
        
        splitAndCount(s1);
        splitAndCount(s2);
        
        for (const auto& entry : count) {
            if (entry.second == 1) {
                result.push_back(entry.first);
            }
        }
        
        return result;
    }
};