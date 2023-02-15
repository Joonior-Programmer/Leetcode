import java.math.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;
        LinkedList<Integer> ret = new LinkedList<>();
        while (i > -1 || k > 0){
            if (i > -1){
                k += num[i--];
            }
            ret.addFirst(k % 10);
            k /= 10;
        }
        return ret;
    }
}