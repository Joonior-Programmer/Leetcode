class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        find_big = {v: -1 for v in nums1}
        stack = []
        ret = []

        for v in nums2:
            while stack and stack[-1] < v:
                key = stack.pop()
                find_big[key] = v
            stack.append(v)
        
        for v in nums1:
            ret.append(find_big[v])
        
        return ret

            