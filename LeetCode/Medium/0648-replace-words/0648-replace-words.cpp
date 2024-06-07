class Trie {
public:
    string word;
    Trie* children[26];

    Trie() {
        word = "";
        for (int i = 0; i < 26; ++i) {
            children[i] = nullptr;
        }
    }
};

class Solution {
public:
    string replaceWords(vector<string>& dictionary, string sentence) {
        Trie* trie = new Trie();

        for (const string& word : dictionary) {
            Trie* curr = trie;
            for (char v : word) {
                int index = v - 'a';
                if (curr->children[index] == nullptr) {
                    curr->children[index] = new Trie();
                }
                curr = curr->children[index];
            }
            curr->word = word;
        }

        istringstream iss(sentence);
        vector<string> words;
        string word;
        while (iss >> word) {
            words.push_back(word);
        }

        for (string& word : words) {
            Trie* curr = trie;
            for (char v : word) {
                if (curr->word != "") break;
                int index = v - 'a';
                if (curr->children[index] != nullptr) {
                    curr = curr->children[index];
                } else {
                    break;
                }
            }
            if (curr->word != "") {
                word = curr->word;
            }
        }

        ostringstream oss;
        for (int i = 0; i < words.size(); ++i) {
            if (i > 0) oss << " ";
            oss << words[i];
        }

        return oss.str();
    }
};
