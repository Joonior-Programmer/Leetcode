class Solution {
public:
    int reverse(int x) {
        long ret = 0;
                
        while (x != 0){
            cout << x % 10 << endl;
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        
        if (ret < pow(-2, 31) || ret > pow(2, 31) - 1) return 0;
        
        return (int) ret;
    }
};