class Solution:
    def numSquares(self, n: int) -> int:
        curr = [n]
        num = 100
        ret = 0
        
        while curr:
            temp = []
            while curr:
                left = curr.pop()
                i = num
                
                while i:
                    if left == i ** 2:
                        return ret + 1
                    elif left > i ** 2:
                        temp.append(left - i ** 2)
                    i -= 1
            
            ret += 1
            curr = temp
            print(curr)
        return ret
        
        