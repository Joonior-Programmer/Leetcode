class Solution {
public:
    int ladderLength(string beginWord, string endWord, vector<string>& wordList) {
        unordered_set<string> words(wordList.begin(), wordList.end());

        if (words.find(endWord) == words.end()) return 0;

        vector<string> stack;
        stack.push_back(beginWord);
        int idx = 0;
        int ret = 1;

        while (idx < stack.size()) {
            int end = stack.size();
            ++ret;

            for (int i = idx; i < end; ++i) {
                ++idx;
                string temp = stack[i];

                for (int j = 0; j < temp.size(); ++j) {
                    char tempChar = temp[j];
                    for (char c = 'a'; c <= 'z'; ++c) {
                        temp[j] = c;
                        if (words.find(temp) != words.end()) {
                            if (temp == endWord) return ret;
                            stack.push_back(temp);
                            words.erase(temp);
                        }
                    }
                    temp[j] = tempChar;
                }
            }
        }

        return 0;
    }
};