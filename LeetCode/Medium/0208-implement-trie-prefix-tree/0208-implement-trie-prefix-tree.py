class Trie:
    def __init__(self):
        self.trie = {}

    def insert(self, word: str) -> None:
        curr = self.trie
        for v in word:
            if v not in curr:
                curr[v] = {}
            curr = curr[v]
                
        curr["end"] = True

    def search(self, word: str) -> bool:
        curr = self.trie
        for v in word:
            if v not in curr:
                return False
            curr = curr[v]
        if "end" in curr:
            return True
        return False

    def startsWith(self, prefix: str) -> bool:
        curr = self.trie
        for v in prefix:
            if v not in curr:
                return False
            curr = curr[v]
        return True


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)