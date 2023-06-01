class Solution {
public:
    int compress(vector<char>& chars) {
        char prev;
        int prev_count;
        int i = 0;
        int idx = 0;
        
        while (i < chars.size()) {
            prev = chars[i];
            prev_count = 1;
            ++i;
            while (i < chars.size() && prev == chars[i]) {
                ++i;
                ++prev_count;
            }
            
            chars[idx++] = prev;
            if (prev_count != 1) {
                for (char v : to_string(prev_count)) chars[idx++] = v;
            }
        }
        
        return idx;
    }
};