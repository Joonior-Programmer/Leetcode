class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int five = 0;
        int ten = 0;
        
        for (int i = 0; i < bills.size(); ++i){
            int bill = bills[i];
            
            if (bill == 5){
                ++five;
            } else if (bill == 10){
                if (--five < 0) return false;
                ++ten;
            } else {
                if (ten > 0) {
                    ten--;
                    five--;
                } else five -= 3;

                if (five < 0) return false;
            }
        }
        return true;
    }
};