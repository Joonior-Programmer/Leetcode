class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        string mos[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        unordered_set<string> ret;
        
        for (string word : words){
            string temp = "";
            
            for (char v : word) temp += mos[v-'a'];
            
            ret.insert(temp);
        }
        
        return ret.size();
    }
};