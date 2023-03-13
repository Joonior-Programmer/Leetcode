class Solution {
public:
    int strStr(string haystack, string needle) {
        int i = 0;
        while (i < haystack.length()){
            if (haystack[i] == needle[0]){
                if (i + needle.length() > haystack.length()) {
                    return -1;
                    }
                bool isEqual = true;
                bool isChanged = false;
                int temp = i;
                for (int j = 1; j < needle.length(); ++j){
                    if (!isChanged && haystack[i+j] == needle[0]) {
                        temp = i + j - 1;
                        isChanged = true;
                        }
                    if (haystack[i+j] != needle[j]){
                        if (!isChanged) temp = i + j;
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) return i;
                i = temp;
            }
            ++i;
        }
        return -1;   
    }
};