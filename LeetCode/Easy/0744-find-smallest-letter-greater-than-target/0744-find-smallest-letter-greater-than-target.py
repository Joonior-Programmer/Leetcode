class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        ret = letters[0]
        for v in letters:
            if v > target:
                return v
        return ret