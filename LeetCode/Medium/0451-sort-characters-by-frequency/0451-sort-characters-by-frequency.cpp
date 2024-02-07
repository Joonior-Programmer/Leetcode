class Solution {
public:
    string frequencySort(string s) {
        vector<int> count(128);
        vector<int> freq(s.size() + 1);
        vector<char> ret(s.size());
        
        for (char v : s)
            ++count[v];
        
        for (int v : count)
            ++freq[v];
        
        int i = freq.size() - 1;
        int idx = 0;
        
        while (i > 0){
            while (freq[i] > 0){
                for (int j = 0; j < 128; ++j){
                    if (count[j] == i){
                        for (int k = 0; k < i; ++k){
                            ret[idx++] = (char) j;
                        }

                        freq[i]--;
                    }
                }
            }
            i--;
            
        }

        return string(ret.begin(), ret.end());
    }
};