class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        ret = []
        for i in range(1, n+1):
            if i % 3 == 0 and i % 5 == 0:
                ret.append("FizzBuzz")
            elif i % 3 == 0:
                ret.append("Fizz")
            elif i % 5 == 0:
                ret.append("Buzz")
            else:
                ret.append(str(i))
        return ret