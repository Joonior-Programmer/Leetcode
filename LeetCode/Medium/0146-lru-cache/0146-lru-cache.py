class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.size = 0
        self.recent_used = deque()
        self.data = defaultdict(int)
        self.skip = [0] * 10001

    def get(self, key: int) -> int:
        if key not in self.data:
            return -1
        self.skip[key] += 1
        self.recent_used.appendleft(key)
        return self.data[key]

    def put(self, key: int, value: int) -> None:
        if key not in self.data:
            self.size += 1

        self.recent_used.appendleft(key)
        self.data[key] = value
        self.skip[key] += 1

        if self.size > self.capacity:
            while self.skip[self.recent_used[-1]] != 1:
                self.skip[self.recent_used.pop()] -= 1
            lru = self.recent_used.pop()
            self.skip[lru] -= 1
            del self.data[lru]
            self.size -= 1


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)