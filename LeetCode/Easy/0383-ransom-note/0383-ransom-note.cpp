class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int counter[26]{0};

        for (int i = 0; i < magazine.size(); ++i){
            ++counter[magazine[i] - 97];
        }
        int location;
        for (int i = 0; i < ransomNote.size(); ++i){
            location = ransomNote[i] - 97;
            if (counter[location] < 1) return false;
            counter[location]--;
        }
        return true;
    }
};