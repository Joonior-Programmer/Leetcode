class Solution:
    def kSmallestPairs(self, nums1: List[int], nums2: List[int], k: int) -> List[List[int]]:
        ret = []

        hq = [(0,0,0)]
        visited = set([(0,0)])

        while k and hq:
            _, i, j = heapq.heappop(hq)

            ret.append([nums1[i], nums2[j]])

            if i + 1 < len(nums1) and (i+1, j) not in visited:
                heappush(hq, (nums1[i+1] + nums2[j], i + 1, j))
                visited.add((i+1, j))
            if j + 1 < len(nums2) and (i, j+1) not in visited:
                heappush(hq, (nums1[i] + nums2[j+1], i, j+1))
                visited.add((i, j+1))
            k -= 1

        return ret

