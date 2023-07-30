class Solution {
    public String intToRoman(int num) {
        StringBuilder ret = new StringBuilder();
        
        while (num / 1000 > 0){
            ret.append("M");
            num -= 1000;
        }
        
        if (num / 900 > 0) {
            ret.append("CM");
            num -= 900;
        }
        
        if (num / 500 > 0) {
            ret.append("D");
            num -= 500;
        }
        
        if (num / 400 > 0) {
            ret.append("CD");
            num -= 400;
        }
        
        while (num / 100 > 0){
            ret.append("C");
            num -= 100;
        }
        
        if (num / 90 > 0){
            ret.append("XC");
            num -= 90;
        }
        
        if (num / 50 > 0){
            ret.append("L");
            num -= 50;
        }
        
        if (num / 40 > 0){
            ret.append("XL");
            num -= 40;
        }
        
        while (num / 10 > 0){
            ret.append("X");
            num -= 10;
        }
        
        if (num / 9 > 0){
            ret.append("IX");
            num -= 9;
        }
        
        if (num / 5 > 0){
            ret.append("V");
            num -= 5;
        }
        
        if (num / 4 > 0){
            ret.append("IV");
            num -= 4;
        }
        
        while (num > 0){
            ret.append("I");
            num -= 1;
        }
        
        return ret.toString();
    }
}