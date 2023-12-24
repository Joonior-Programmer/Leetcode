class Solution {
public:
    int minOperations(string s) {
        char c1 = '1';
        char c2 = '0';
        int t1 = 0;
        int t2 = 0;
        
        for (char v : s){
            if (c1 == v) ++t1;
            else ++t2;
            
            char temp = c1;
            c1 = c2;
            c2 = temp;
        }
        
        return min(t1, t2);
    }
};