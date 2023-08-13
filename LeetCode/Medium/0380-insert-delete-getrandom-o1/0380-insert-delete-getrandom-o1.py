class RandomizedSet:

    def __init__(self):
        self.dict = {}
        self.vals = []

    def insert(self, val: int) -> bool:
        if val in self.dict:
            return False

        self.dict[val] = len(self.vals)
        self.vals.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val not in self.dict:
            return False
            
        length = len(self.vals)-1
        idx = self.dict.pop(val)

        if idx == length:
            self.vals.pop()
        else:
            self.vals[idx], self.vals[length] = self.vals[length], self.vals[idx]
            self.dict[self.vals[idx]] = idx
            self.vals.pop()

        return True
        

    def getRandom(self) -> int:
        return self.vals[random.randrange(len(self.vals))]
        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()