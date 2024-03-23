class Solution {
    public int minimumSum(int num) {
        int[] vals = new int[4];
        int i = 0;
        
        while (num > 0){
            vals[i++] = num % 10;
            num /= 10;
        }
            
        Arrays.sort(vals);
        
        int ret1 = vals[0];
        int ret2 = vals[1];
        ret1 = ret1 * 10 + vals[2];
        ret2 = ret2 * 10 + vals[3];
        
        return ret1 + ret2;
    }
}