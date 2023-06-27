class Solution:
    def maxScore(self, nums1: List[int], nums2: List[int], k: int) -> int:
        pairs = [(n1, n2) for n1, n2 in zip(nums1, nums2)]
        pairs.sort(key=lambda x : x[1], reverse=True)
        
        heap = []
        n1_sum = 0
        ret = 0

        for n1, n2 in pairs:
            n1_sum += n1
            heapq.heappush(heap, n1)

            if len(heap) > k:
                temp = heapq.heappop(heap)
                n1_sum -= temp
            
            if len(heap) == k:
                ret = max(ret, n1_sum * n2)

        return ret