class Solution {
    int n;
    int[] position;
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        this.position = position;
        n = position.length;
        int l = 1;
        int r = (position[n-1] - position[0]) / (m - 1);
        
        while (l <= r){
            int mid = (r + l) / 2;
            
            if (check(mid) >= m) l = mid + 1;
            else r = mid - 1;
        }
        
        return r;
    }
    
    private int check(int x){
        int curr = 1;
        int start = position[0];
        
        for (int i = 1; i < n; ++i)
            if (position[i] - start >= x){
                start = position[i];
                ++curr;
            }
        
        return curr;
    }
}