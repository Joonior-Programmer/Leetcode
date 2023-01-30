class Solution {
public:
    int tribonacci(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        int first = 0;
        int second = 1;
        int third = 1;
        for (int i = 3; i < n + 1; ++i){
            int temp = first + second + third;
            first = second;
            second = third;
            third = temp;
        }
        return third;
    }
};