class Solution {
public:
    int m;
    int k;
    vector<int> bloomDay;
    
    int minDays(vector<int>& bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.size()) return -1;
        
        this->k = k;
        this->m = m;
        this->bloomDay = bloomDay;
        
        int l = INT_MAX;
        int r = INT_MIN;
        
        for (int v : bloomDay){
            if (v < l) l = v;
            if (v > r) r = v;
        }
        
        while (l < r){
            int mid = (l + r) / 2;

            if (check(mid)) r = mid;
            else l = mid + 1;
        }
        
        return l;
    }
    
    bool check(int x) {
        int bouquets = 0;
        int curr = 0;
        
        for (int v : bloomDay){
            if (v <= x) {
                ++curr;
                if (curr == k){
                    curr = 0;
                    if (++bouquets == m) return true;
                }
            }
            
            else curr = 0;
        }
        
        return false;
    }
};