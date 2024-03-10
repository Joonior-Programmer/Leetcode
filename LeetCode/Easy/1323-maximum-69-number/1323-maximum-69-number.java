class Solution {
    public int maximum69Number (int num) {
        int ret = num;
        int curr = 0;
        int digit = -1;

        while (num > 0) {
            if (num % 10 == 6) 
                digit = curr;
            
            num /= 10;
            curr++;
        }

        if (digit > -1) ret += 3 * Math.pow(10, digit);

        return ret;
    }
}