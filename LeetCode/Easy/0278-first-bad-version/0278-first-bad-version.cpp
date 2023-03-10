// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        long good_max = 0;
        long bad_min = n;
        long mid = (good_max + bad_min) / 2;
        while(good_max + 1 != bad_min){
            if (isBadVersion(mid)) bad_min = mid;
            else good_max = mid;
            mid = (good_max + bad_min) / 2;
        }
        return bad_min;
    }
};