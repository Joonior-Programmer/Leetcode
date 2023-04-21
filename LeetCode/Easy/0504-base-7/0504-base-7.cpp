class Solution {
public:
    string convertToBase7(int num) {
        if (num == 0) return "0";

        string ret;
        
        if (num < 0) {
            ret += "-";
            num *= -1;
        }

        int power = 8;
        while (num / (int) pow(7, power) == 0) power--;
        
        while (power > -1){
            ret += to_string( num / (int) pow(7, power));
            num %= (int) pow(7, power);
            power--;
        }

        return ret;
    }
};