class Solution {
public:
    double average(vector<int>& salary) {
        double maxSalary = DBL_MIN;
        double minSalary = DBL_MAX;
        double total = 0;
        for (int i = 0; i < salary.size(); ++i){
            maxSalary = salary[i] > maxSalary ? salary[i] : maxSalary;
            minSalary = salary[i] < minSalary ? salary[i] : minSalary;
            total += salary[i];
        }
        return (total - maxSalary - minSalary) / (salary.size() - 2);
    }
};