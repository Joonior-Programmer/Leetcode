class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        ret = sentence.split()
        trie = {}
        idx = 0
        
        for root in dictionary:
            word = []
            curr = trie
            for v in root:
                if v not in curr:
                    curr[v] = {}
                
                word.append(v)
                curr = curr[v]
                
            curr["word"] = "".join(word)

        for word in ret:
            curr = trie

            for v in word:
                if "word" in curr:
                    break
                if v in curr:
                    curr = curr[v]
                else:
                    break
            
            if "word" in curr:
                ret[idx] = curr["word"]
            idx += 1
        
        return " ".join(ret)
                
            