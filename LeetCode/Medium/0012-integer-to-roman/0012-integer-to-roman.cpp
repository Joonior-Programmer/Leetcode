class Solution {
public:
    string intToRoman(int num) {
        stringstream ret;
        
        while (num / 1000 > 0){
            ret << "M";
            num -= 1000;
        }
        
        if (num / 900 > 0) {
            ret << "CM";
            num -= 900;
        }
        
        if (num / 500 > 0) {
            ret << "D";
            num -= 500;
        }
        
        if (num / 400 > 0) {
            ret << "CD";
            num -= 400;
        }
        
        while (num / 100 > 0){
            ret << "C";
            num -= 100;
        }
        
        if (num / 90 > 0){
            ret << "XC";
            num -= 90;
        }
        
        if (num / 50 > 0){
            ret << "L";
            num -= 50;
        }
        
        if (num / 40 > 0){
            ret << "XL";
            num -= 40;
        }
        
        while (num / 10 > 0){
            ret << "X";
            num -= 10;
        }
        
        if (num / 9 > 0){
            ret << "IX";
            num -= 9;
        }
        
        if (num / 5 > 0){
            ret << "V";
            num -= 5;
        }
        
        if (num / 4 > 0){
            ret << "IV";
            num -= 4;
        }
        
        while (num > 0){
            ret << "I";
            num -= 1;
        }
        
        return ret.str();
    }
};