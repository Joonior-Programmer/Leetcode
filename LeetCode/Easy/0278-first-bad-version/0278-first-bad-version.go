/** 
 * Forward declaration of isBadVersion API.
 * @param   version   your guess about first bad version
 * @return 	 	      true if current version is bad 
 *			          false if current version is good
 * func isBadVersion(version int) bool;
 */

func firstBadVersion(n int) int {
    good_max := 0
    bad_min := n
    mid := (good_max + bad_min) / 2
    for good_max + 1 != bad_min {
        if isBadVersion(mid) {
            bad_min = mid
        } else {good_max = mid}
        mid = (good_max + bad_min) / 2
    }
    return bad_min
}