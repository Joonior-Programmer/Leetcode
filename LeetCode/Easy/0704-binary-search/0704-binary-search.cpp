class Solution {
public:
    int search(vector<int>& nums, int target) {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        
        int l = 0, r = nums.size() - 1;

        while (l <= r){
            int mid = (l + r) / 2;
            int v = nums[mid];

            if (v == target)
                return mid;
            else if (v < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        
        return -1;
    }
};