class Solution {
public:
    int sumOfMultiples(int n) {
        int ret = 0;
        
        for (int i = 3; i < n + 1; i += 3) ret += i;
        for (int i = 5; i < n + 1; i += 5)
            if (i % 3 != 0) ret += i;
        for (int i = 7; i < n + 1; i += 7)
            if (i % 3 != 0 && i % 5 != 0) ret += i;
        
        return ret;
    }
};