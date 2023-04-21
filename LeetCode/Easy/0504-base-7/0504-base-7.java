class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        
        if (num < 0) {
            sb.append("-");
            num *= -1;
        }

        int power = 8;
        while (num / (int) Math.pow(7, power) == 0) power--;
        
        while (power > -1){
            sb.append(num / (int) Math.pow(7, power));
            num %= Math.pow(7, power);
            power--;
        }

        return sb.toString();
    }
}