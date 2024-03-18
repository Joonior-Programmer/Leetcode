struct Word {
    int index;
    string word;

    Word(int idx, const string& wd) : index(idx), word(wd) {}
};

bool compare(const Word& a, const Word& b) {
    return a.index < b.index;
}

class Solution {
public:
    string sortSentence(string s) {
        vector<string> words;
        size_t pos = 0, found;
        while ((found = s.find(' ', pos)) != string::npos) {
            words.push_back(s.substr(pos, found - pos));
            pos = found + 1;
        }
        words.push_back(s.substr(pos));

        vector<Word> pairs;
        for (const auto& word : words) {
            int lastIndex = word.back() - '0';
            pairs.emplace_back(lastIndex, word.substr(0, word.size() - 1));
        }

        sort(pairs.begin(), pairs.end(), compare);

        string result;
        for (size_t i = 0; i < pairs.size(); ++i) {
            result += pairs[i].word;
            if (i != pairs.size() - 1) result += ' ';
        }
        
        return result;
    }
};