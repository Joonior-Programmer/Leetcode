class Solution:
    def bagOfTokensScore(self, tokens: List[int], power: int) -> int:
        tokens.sort()
        curr = 0
        ret = 0
        l, r = 0, len(tokens) - 1
        
        while l <= r:
            if tokens[l] <= power:
                curr += 1
                power -= tokens[l]
                l += 1
                ret = max(ret, curr)
            elif ret:
                power += tokens[r]
                curr -= 1
                r -= 1
            else:
                break
        
        return ret