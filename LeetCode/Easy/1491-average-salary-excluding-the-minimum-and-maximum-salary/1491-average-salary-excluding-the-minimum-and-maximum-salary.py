class Solution:
    def average(self, salary: List[int]) -> float:
        min_salary = float("inf")
        max_salary = float("-inf")
        total = 0
        for v in salary:
            max_salary = max(max_salary, v)
            min_salary = min(min_salary, v)
            total += v
        return (total - min_salary - max_salary) / (len(salary) - 2)