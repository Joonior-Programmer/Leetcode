class Solution {
public:
    string freqAlphabets(string s) {
        string ret = "";
        int i = 0;
        int n = s.size();
        
        while (i < n){
            if (i + 2 < n && s[i+2] == '#'){
                ret += (char)(96 + (s[i] - 48) * 10 + s[i+1] - 48);
                i += 3;
            } else 
                ret += (char)(96 + s[i++] - 48);
            
        }
        
        return ret;
    }
};