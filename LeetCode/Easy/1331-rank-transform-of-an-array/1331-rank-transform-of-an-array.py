class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        temp = sorted(set(arr))
        dictionary = {v: i + 1 for i, v in enumerate(temp)}
        
        return [dictionary[arr[i]] for i in range(len(arr))]