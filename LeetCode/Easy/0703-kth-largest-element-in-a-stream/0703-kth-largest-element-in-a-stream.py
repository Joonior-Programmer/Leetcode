class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.hq = nums

        heapify(self.hq)

        while len(nums) > k:
            heappop(self.hq)


    def add(self, val: int) -> int:
        heappush(self.hq, val)

        if len(self.hq) > self.k:
            heappop(self.hq)

        return self.hq[0]


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)