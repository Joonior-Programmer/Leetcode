/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long l = 0;
        long r = n;
        long mid;
        int ret = 0;
        while (ret == 0){
            mid = (l + r) / 2;
            int where = guess((int)mid);
            if (where == 0) ret = (int)mid;
            else if (where == 1) l = mid + 1;
            else r = mid;
        }
        return ret;
        
    }
}