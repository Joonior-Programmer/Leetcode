class Solution {
public:
    vector<int> findSubstring(string s, vector<string>& words) {
        vector<int> ret;
        int n = s.length();
        int wordLen = words[0].length();
        int numWords = words.size();
        int totalLen = wordLen * numWords;
        unordered_map<string, int> count;

        for (int i = 0; i < numWords; ++i)
            count[words[i]] = count[words[i]] + 1;

        for (int i = 0; i < wordLen; ++i) {
            int l = i;
            int r = i;
            unordered_map<string, int> tempCount;
            while (r + wordLen <= n) {
                string tempWord = s.substr(r, wordLen);
                r += wordLen;
                if (count.find(tempWord) != count.end()) {
                    tempCount[tempWord] = tempCount[tempWord] + 1;

                    while (tempCount[tempWord] > count[tempWord]) {
                        string tempKey = s.substr(l, wordLen);
                        tempCount[tempKey] = tempCount[tempKey] - 1;
                        l += wordLen;
                    }

                    if (r - l == totalLen) {
                        ret.push_back(l);
                        string tempKey = s.substr(l, wordLen);
                        tempCount[tempKey] = tempCount[tempKey] - 1;
                        l += wordLen;
                    }

                } else {
                    tempCount.clear();
                    l = r;
                }
            }
        }

        return ret;
    }
};