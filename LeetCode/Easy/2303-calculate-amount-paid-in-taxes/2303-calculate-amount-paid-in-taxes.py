class Solution:
    def calculateTax(self, brackets: List[List[int]], income: int) -> float:
        prev = brackets[0][0]
        ret = min(prev, income) * brackets[0][1] / 100
        i = 1
        n = len(brackets)
        income -= prev

        while income > 0 and i < n:
            temp = brackets[i][0]
            need_to_subtract = min(temp - prev, income)
            ret += min(temp - prev, income) * brackets[i][1] / 100
            income -= temp - prev
            prev = temp
            i += 1
        
        return ret