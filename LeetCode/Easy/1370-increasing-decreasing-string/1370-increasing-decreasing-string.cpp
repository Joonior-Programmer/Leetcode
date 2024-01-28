class Solution {
public:
    string sortString(string s) {
        vector<int> count(26);
        string ret = "";
        int i = 0;
        int l = 0, r = 25;

        for (char v : s)
            ++count[v-97];

        while (i < s.size()){
            while (l < r && count[l] == 0)
                ++l;
            
            ret += (char) (l+97);
            ++i;
            count[l]--;

            for (int j = l + 1; j < r + 1; ++j){
                if (count[j] != 0){
                    count[j]--;
                    ret += (char) (j+97);
                    ++i;
                }
            }
        
            if (i == s.size())
                break;

            while (r > l && count[r] == 0)
                r--;

            ret += (char) (r+97);
            ++i;
            count[r]--;

            for (int j = r - 1; j > l - 1; j--){
                if (count[j] != 0){
                    count[j]--;
                    ret += (char) (j+97);
                    ++i;
                }
            }
        }
        
        return ret;
    }
};