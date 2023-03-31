class Solution:
    def longestPalindrome(self, s: str) -> int:
        counter = Counter(s)
        ret = 0
        is_added_one = False
        for v in counter.values():
            ret += v // 2 * 2
            if not is_added_one and v % 2 == 1:
                ret += 1
                is_added_one = True

        return ret