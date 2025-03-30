class Solution {
public:
    vector<int> partitionLabels(string s) {
        vector<int> idxs(26);

        for (int i = 0; i < s.size(); ++i) idxs[s[i]-97] = i;

        int size = 0;
        int end = idxs[s[0]-97];
        vector<int> ret;

        for (int i = 0; i < s.size(); ++i){
            ++size;
            end = max(end, idxs[s[i]-97]);
            
            if (end == i) {
                ret.push_back(size);
                size = 0;
            }
        }

        return ret;
    }
};