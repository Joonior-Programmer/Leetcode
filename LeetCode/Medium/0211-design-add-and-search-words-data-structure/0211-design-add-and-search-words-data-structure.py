class WordDictionary:

    def __init__(self):
        self.trie = {}

    def addWord(self, word: str) -> None:
        curr = self.trie
        for v in word:
            if v not in curr:
                curr[v] = {}
            curr = curr[v]
        curr["valid"] = True
        

    def search(self, word: str) -> bool:
        def dfs(trie, idx):
            curr = trie
            
            for i in range(idx, len(word)):
                if word[i] == ".":
                    for v in curr:
                        if v != "valid" and dfs(curr[v], i+1):
                            return True
                    return False
                elif word[i] not in curr:
                    return False
                else:
                    curr = curr[word[i]]

            if "valid" in curr:
                return True
            return False

        return dfs(self.trie, 0)
    



# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)