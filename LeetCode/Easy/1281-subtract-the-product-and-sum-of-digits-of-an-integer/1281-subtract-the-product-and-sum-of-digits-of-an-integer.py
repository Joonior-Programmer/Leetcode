class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        product_num = 1
        sum_num = 0
        
        while n:
            temp = n % 10
            product_num *= temp
            sum_num += temp
            n //= 10
        
        return product_num - sum_num