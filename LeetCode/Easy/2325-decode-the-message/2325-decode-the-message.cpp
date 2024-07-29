class Solution {
public:
    string decodeMessage(string key, string message) {
        int n = message.size();
        vector<char> decode(26);
        int idx = 0;
        string ret = "";
        
        for (char v : key)
            if (v != ' ' && decode[v-97] == 0)
                decode[v-97] = (char) (97 + idx++);
            
        
        for (char v : message)
            if (v != ' ') ret += decode[v-97];
            else ret += ' ';
        
        return ret;
    }
};