class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while(i > -1 && j > -1){
            carry += num1Char[i] - 48 + num2Char[j] - 48;
            sb.append(carry % 10);
            carry /= 10;
            i--;
            j--;
        }
        while (i > -1){
            carry += num1Char[i] - 48;
            sb.append(carry % 10);
            carry /= 10;
            i--;
        }
        while (j > -1){
            carry += num2Char[j] - 48;
            sb.append(carry % 10);
            carry /= 10;
            j--;
        }
        if (carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }
}