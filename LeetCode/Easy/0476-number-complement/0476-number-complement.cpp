class Solution {
public:
    int findComplement(int num) {
        int ret = 0;
        int temp = num;
        while (temp > 0) {
            ++ret;
            temp >>= 1;
        }
        return num ^ (int)(pow(2, ret) - 1);
    }
};