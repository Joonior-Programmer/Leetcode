class Solution:
    def maxScore(self, nums1: List[int], nums2: List[int], k: int) -> int:
        idxs = sorted([i for i in range(len(nums1))], key=lambda x : nums2[x], reverse=True)
        
        heap = [nums1[idxs[i]] for i in range(k)]
        n1_sum = sum(nums1[idxs[i]] for i in range(k))
        ret = n1_sum * nums2[idxs[k-1]]
        heapify(heap)

        for i in idxs[k:]:
            n1_sum += nums1[i] - heapq.heappushpop(heap, nums1[i])
            ret = max(ret, n1_sum * nums2[i])

        return ret