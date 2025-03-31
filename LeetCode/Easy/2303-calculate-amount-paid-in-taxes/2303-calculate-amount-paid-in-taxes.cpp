class Solution {
public:
    double calculateTax(vector<vector<int>>& brackets, int income) {
        double ret = 0;
        int prev = 0;

        for (vector<int> bracket : brackets){
            if (income == 0) break;

            int upper = bracket[0];
            int temp = min(income, upper - prev);
            ret += temp * (double) bracket[1] / 100;
            income -= temp;
            prev = upper;
        }

        return ret;
    }
};