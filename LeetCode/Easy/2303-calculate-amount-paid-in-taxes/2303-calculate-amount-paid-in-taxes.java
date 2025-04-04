class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ret = 0;
        int prev = 0;

        for (int[] bracket : brackets){
            if (income == 0) break;

            int upper = bracket[0];
            int temp = Math.min(upper - prev, income);
            prev = upper;
            ret += temp * bracket[1] / 100d;
            income -= temp;
        }

        return ret;
    }
}