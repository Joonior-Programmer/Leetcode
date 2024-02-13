class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for (string word : words){
            int l = 0;
            int r = word.size() - 1;
            
            while (l < r){
                if (word[l] != word[r]) break;
                ++l;
                r--;
            }
            
            if (l >= r) return word;
        }
        
        return "";
    }
};