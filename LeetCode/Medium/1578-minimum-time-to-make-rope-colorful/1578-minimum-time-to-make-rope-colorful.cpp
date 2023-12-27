class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int ret = 0;
        char prev = colors[0];
        int prevTime = neededTime[0];
        
        for (int i = 1; i < neededTime.size(); ++i){
            if (prev == colors[i]){
                ret += min(prevTime, neededTime[i]);
                prevTime = max(prevTime, neededTime[i]);
            } else {
                prev = colors[i];
                prevTime = neededTime[i];
            }
        }
        
        return ret;
    }
};