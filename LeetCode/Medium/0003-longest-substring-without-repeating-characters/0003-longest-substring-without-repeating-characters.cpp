class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        bool exist[128]{false,};
        int count = 0;
        int ret = 0;
        queue<char> q;
        
        for (int i = 0; i < s.size(); ++i){
            if (!exist[s[i]]) {
                exist[s[i]] = true;
                ++count;
                q.push(s[i]);
                ret = max(ret, count);
            } else {
                while (q.front() != s[i]){
                    exist[q.front()] = false;
                    q.pop();
                    count--;
                }
                q.pop();
                q.push(s[i]);
            }
        }
        return ret;
    }
};