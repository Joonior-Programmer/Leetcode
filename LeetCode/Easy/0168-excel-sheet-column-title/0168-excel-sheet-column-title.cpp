class Solution {
public:
    string convertToTitle(int columnNumber) {
        string ret = "";
        while (columnNumber) {
            columnNumber -= 1;
            ret = (char) (columnNumber % 26 + 65) + ret;
            columnNumber /= 26;
        }
        return ret;
    }
};