class Solution {
public:
    vector<int> position;
    int n;
    
    int maxDistance(vector<int>& position, int m) {
        sort(position.begin(), position.end());
        
        this->position = position;
        n = position.size();
        int l = 1;
        int r = (position[n-1] - position[0]) / (m - 1);
        
        while (l <= r){
            int mid = (r + l) / 2;
            
            if (check(mid) >= m) l = mid + 1;
            else r = mid - 1;
        }
        
        return r;
    }
    
    int check(int x){
        int curr = 1;
        int start = position[0];
        
        for (int i = 1; i < n; ++i)
            if (position[i] - start >= x){
                start = position[i];
                ++curr;
            }
        
        return curr;
    }
};