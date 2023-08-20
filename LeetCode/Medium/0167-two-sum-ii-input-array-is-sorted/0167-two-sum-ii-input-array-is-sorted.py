class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        first = 0
        second = len(numbers) - 1
        
        while numbers[first] + numbers[second] != target:
            if numbers[first] + numbers[second] > target:
                second -= 1
            else:
                first += 1

        return [first+1, second+1]