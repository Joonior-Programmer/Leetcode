class Solution {
public:
    bool isHappy(int n) {
        unordered_set<int> set{};
        while (n != 1){
            if(set.find(n) != set.end()){
                return false;
            }
            set.insert(n);
            int temp = 0;
            int tempN = n;
            while (tempN != 0){
                temp += (tempN % 10) * (tempN % 10);
                tempN /= 10;
            }
            n = temp;
        }
        return true;
    }
};