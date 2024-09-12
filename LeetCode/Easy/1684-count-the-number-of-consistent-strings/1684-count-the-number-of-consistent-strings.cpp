class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);

        vector<bool> allow(26);
        int ret = words.size();
        
        for (int i = 0; i < allowed.size(); ++i) allow[allowed[i] - 97] = true;
        
        for (string word : words)
            for (char v : word)
                if (!allow[v-97]){
                    ret--;
                    break;
                }
        
        return ret;
    }
};