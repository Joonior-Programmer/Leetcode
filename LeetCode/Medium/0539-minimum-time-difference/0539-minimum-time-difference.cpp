class Solution {
public:
    int findMinDifference(vector<string>& timePoints) {
        int n = timePoints.size();
        vector<int> time(n);
        vector<bool> exist(1440);
        int i = 0;
        
        for (string v : timePoints){
            int temp = (v[0] - 48) * 600 + (v[1] - 48) * 60 + 
                (v[3] - 48) * 10 + v[4] - 48;
            
            if (exist[temp]) return 0;
            
            exist[temp] = true;
            time[i++] = temp;
        }
        
        sort(time.begin(), time.end());
        
        int ret = 24 * 60 - time[n-1] + time[0];
        
        for (i = 1; i < n; ++i) ret = min(ret, time[i] - time[i-1]);
        
        return ret;
    }
};