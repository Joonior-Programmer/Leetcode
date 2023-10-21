class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n, m = len(nums1), len(nums2)
        total_len = n + m
        merged = [0] * (n + m)

        i, j, k = 0, 0, 0

        while i < n and j < m:
            if nums1[i] < nums2[j]:
                merged[k] = nums1[i]
                i += 1
            else:
                merged[k] = nums2[j]
                j += 1
            k += 1
        
        for idx in range(i, n):
            merged[k] = nums1[idx]
            k += 1
        for idx in range(j, m):
            merged[k] = nums2[idx]
            k += 1

        if total_len % 2 == 0:
            return (merged[total_len // 2] + merged[total_len // 2 - 1]) / 2

        return merged[total_len // 2]