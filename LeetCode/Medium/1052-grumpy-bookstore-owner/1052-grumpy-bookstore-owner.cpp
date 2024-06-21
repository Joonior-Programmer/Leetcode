class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int n = customers.size();
        int ret = 0;
        int unsatisfied = 0;
        
        for (int i = 0; i < minutes; ++i)
            if (grumpy[i] == 1) unsatisfied += customers[i];
            else ret += customers[i];
        
        for (int i = minutes; i < n; ++i)
            if (grumpy[i] == 0) ret += customers[i];
        
        int maxVal = unsatisfied;
        
        for (int i = minutes; i < n; ++i){
            if (grumpy[i-minutes] == 1) unsatisfied -= customers[i-minutes];
            if (grumpy[i] == 1) unsatisfied += customers[i];
            maxVal = max(maxVal, unsatisfied);
        }
        
        return ret + maxVal;
    }
};