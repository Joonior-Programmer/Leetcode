class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char, int> counter;
        int ret = -1;
        for (int i = 0; i < s.size(); ++i){
            if (counter.find(s[i]) == counter.end()){
                counter.insert({s[i], 1});
            } else {
                ++counter[s[i]];
            }
        }
        bool exist = false;
        for(auto iter=counter.begin();iter!=counter.end();iter++){
            if (iter->second == 1) {
                exist = true;
                break;
            }
        }
        
        if (!exist) return ret;
        
        for (int i = 0; i < s.size(); ++i){
            if(counter[s[i]] == 1) {
                ret = i;
                break;
            }
        }
        return ret;
    }
};