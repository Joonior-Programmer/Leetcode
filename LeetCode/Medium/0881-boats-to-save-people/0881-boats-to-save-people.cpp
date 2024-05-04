class Solution {
public:
    int numRescueBoats(vector<int>& people, int limit) {
        sort(people.begin(), people.end());
        
        int l = 0;
        int r = people.size() - 1;
        int ret = 0;
        
        while (r >= l) {
            if (people[l] + people[r] <= limit) ++l;
            r--;
            ++ret;
        }
        
        return ret;
    }
};