class Solution {
public:
    vector<string> fullJustify(vector<string>& words, int maxWidth) {
        vector<string> ret;
        int l = 0, r = 0, curr = 0, n = words.size();

        string temp;

        while (r < n) {
            if (curr + words[r].length() <= maxWidth)
                curr += words[r++].length() + 1;
            else {
                if (l + 1 == r) {
                    temp.append(words[l]);
                    temp.append(string(maxWidth - curr + 1, ' '));
                } else {
                    int numOfWords = r - l;
                    int spaceNeeded = maxWidth - curr + numOfWords;
                    int spaceEach = spaceNeeded / (numOfWords - 1);
                    int extraSpace = spaceNeeded % (numOfWords - 1);

                    for (int i = l; i < r - 1; ++i) {
                        temp.append(words[i]);
                        temp.append(string(spaceEach, ' '));

                        if (extraSpace > 0) {
                            temp.append(" ");
                            extraSpace--;
                        }
                    }

                    temp.append(words[r - 1]);
                }

                ret.push_back(temp);
                temp.clear();
                l = r;
                curr = words[r++].length() + 1;
            }
        }

        temp.append(words[l]);

        for (int i = l + 1; i < r; ++i) {
            temp.append(" ");
            temp.append(words[i]);
        }

        temp.append(string(maxWidth - curr + 1, ' '));
        ret.push_back(temp);

        return ret;
    }
};