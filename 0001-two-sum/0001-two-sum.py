class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # for i,v in enumerate(nums): [0,1,2,3,4]
        #     for j, value in enumerate(nums[i+1:]):
        #         if v + value == target:
        #             return [i, j+i+1]

        # 0,1 => 0,2 => 0,3 

        # dictionary = dict()
        # for i, v in enumerate(nums):
        #     if v in dictionary:
        #         dictionary[v].append(i)
        #     else:
        #         dictionary[v] = [i]
        

        # for i, v in enumerate(nums):
        #     if target - v in dictionary:
        #         for value in dictionary[target-v]:
        #             if value != i:
        #                 return [i, value] 
        dictionary = {}
        for i, v in enumerate(nums):
            need = target - v
            if need in dictionary:
                return [dictionary[need], i]
            dictionary[v] = i
            
        
