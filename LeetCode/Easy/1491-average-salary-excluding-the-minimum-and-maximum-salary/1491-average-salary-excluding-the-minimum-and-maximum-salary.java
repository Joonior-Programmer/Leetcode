class Solution {
    public double average(int[] salary) {
        double maxSalary = Integer.MIN_VALUE;
        double minSalary = Integer.MAX_VALUE;
        double total = 0;
        for (int i = 0; i < salary.length; ++i){
            maxSalary = Math.max(maxSalary, salary[i]);
            minSalary = Math.min(minSalary, salary[i]);
            total += salary[i];
        }
        return (total - maxSalary - minSalary) / (salary.length - 2);
    }
}