class Solution:
    def maxWidthRamp(self, nums: List[int]) -> int:
        stack = [0]
        n = len(nums)
        ret = 0
        
        for i in range(1, n):
            if nums[stack[-1]] > nums[i]:
                stack.append(i)
        
        i = n - 1
        
        while stack and i > -1:
            while stack and nums[stack[-1]] <= nums[i]:
                j = stack.pop()
                ret = max(ret, i - j)
            i -= 1
            
        return ret

def kdsmain():
    input_data = sys.stdin.read().strip()
    lines = input_data.splitlines()
    
    num_test_cases = len(lines)
    results = []

    for i in range(num_test_cases):
        nums = json.loads(lines[i])
        
        result = Solution().maxWidthRamp(nums)
        results.append(str(result))

    with open('user.out', 'w') as f:
        for result in results:
            f.write(f"{result}\n")

if __name__ == "__main__":
    kdsmain()
    exit(0)