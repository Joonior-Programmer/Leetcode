class SmallestInfiniteSet:

    def __init__(self):
        self.heap = []
        self.curr = 1

    def popSmallest(self) -> int:
        if self.heap:
            return self.heap.pop()
        else:
            self.curr += 1
            return self.curr - 1

    def addBack(self, num: int) -> None:
        if num < self.curr and num not in self.heap:
            self.heap.append(num)
            self.heap.sort(reverse=True)


# Your SmallestInfiniteSet object will be instantiated and called as such:
# obj = SmallestInfiniteSet()
# param_1 = obj.popSmallest()
# obj.addBack(num)