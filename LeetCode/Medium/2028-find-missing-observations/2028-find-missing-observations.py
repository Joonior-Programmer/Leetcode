class Solution:
    def missingRolls(self, rolls: List[int], mean: int, n: int) -> List[int]:
        m = len(rolls)
        sum_curr = sum(rolls)

        need = (n + m) * mean - sum_curr
        average = need / n
        
        if average > 6 or average < 1:
            return []

        average = int(average)

        ret = []

        while n:
            ret.append(average)
            need -= average
            n -= 1

        for i in range(need):
            ret[i] += 1

        return ret
        
        
def main():
    inputs = map(loads, sys.stdin)
    results = []

    while True:
        try:
            rolls = next(inputs)
            mean = next(inputs)
            n = next(inputs)
            
            result = Solution().missingRolls(rolls, mean, n)
            results.append(result)
        except StopIteration:
            break

    with open("user.out", "w") as f:
        for result in results:
            print(dumps(result).replace(", ", ","), file=f)

            
if __name__ == "__main__":
    main()
    sys.exit(0)