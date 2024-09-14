class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        target = max(nums)
        ret = 0
        curr = 0

        for v in nums:
            if v == target:
                curr += 1
            else:
                ret = max(ret, curr)
                curr = 0
        
        ret = max(ret, curr)
        
        return ret

def kdsmain():
    input_data = sys.stdin.read().strip()
    lines = input_data.splitlines()
    
    num_test_cases = len(lines)
    results = []

    for i in range(num_test_cases):
        nums = json.loads(lines[i])
        
        result = Solution().longestSubarray(nums)
        results.append(str(result))

    with open('user.out', 'w') as f:
        for result in results:
            f.write(f"{result}\n")

if __name__ == "__main__":
    kdsmain()
    exit(0)