class Solution {
public:
    string addStrings(string num1, string num2) {
        stringstream ss;
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while(i > -1 && j > -1){
            carry += num1[i] - 48 + num2[j] - 48;
            ss << carry % 10;
            carry /= 10;
            i--;
            j--;
        }
        while(i > -1){
            carry += num1[i] - 48;
            ss << carry % 10;
            carry /= 10;
            i--;
        }
        while(j > -1){
            carry += num2[j] - 48;
            ss << carry % 10;
            carry /= 10;
            j--;
        }
        if (carry) ss << carry;
        string ret = ss.str();
        reverse(ret.begin(), ret.end());
        return ret;
    }
};