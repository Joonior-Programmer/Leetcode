class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        nums = [str(v) for v in nums]

        def compare(a, b):
            if a + b > b + a:
                return -1
            return 1

        nums.sort(key=cmp_to_key(compare))

        return "".join(nums).lstrip("0") or "0"