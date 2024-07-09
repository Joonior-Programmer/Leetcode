class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
        double ret = 0;
        int curr = customers[0][0];
        
        for (vector<int>& v : customers){
            curr = max(curr, v[0]) + v[1];
            ret += curr - v[0];
        }
        
        return ret / customers.size();
    }
};