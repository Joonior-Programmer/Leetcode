/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * func guess(num int) int;
 */

func guessNumber(n int) int {
    var l int64 = 0
    var r int64 = int64(n)
    var mid int64
    ret := 0
    for ret == 0 {
        mid = (l + r) / 2
        where := guess(int(mid))
        if where == 0 {
            ret = int(mid)
        } else if where == 1 {
            l = mid + 1
        } else {
            r = mid
        }
    }
    return ret
}