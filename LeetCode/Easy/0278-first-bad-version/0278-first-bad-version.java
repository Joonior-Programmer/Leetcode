/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long good_max = 0;
        long bad_min = n;
        long mid = (good_max + bad_min) / 2;
        while (good_max + 1 != bad_min){
            if (isBadVersion((int) mid)) bad_min = mid;
            else good_max = mid;
            mid = (good_max + bad_min) / 2;
        }
        return (int) bad_min;
    }
}