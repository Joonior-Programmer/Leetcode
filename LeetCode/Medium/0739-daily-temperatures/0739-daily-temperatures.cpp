class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        int n = temperatures.size();
        int hottest = 0;
        vector<int> ret(n);
        
        for (int i = n - 1; i > -1; i--){
            int curTemp = temperatures[i];
            if (curTemp >= hottest) {
                hottest = curTemp;
                continue;
            }
            
            int days = 1;
            
            while (curTemp >= temperatures[i+days]) days += ret[i+days];
            ret[i] = days;
        }
        return ret;
    }
};