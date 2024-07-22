class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        return [v for _, v in sorted(zip(heights, names), reverse=True)]