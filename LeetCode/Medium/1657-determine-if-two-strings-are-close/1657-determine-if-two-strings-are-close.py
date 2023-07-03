class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1) != len(word2):
            return False
        
        map1 = Counter(word1)
        map2 = Counter(word2)

        counts1 = []
        counts2 = []

        for k,v in map1.items():
            if k not in map2:
                return False
            counts1.append(v)
        
        for k,v in map2.items():
            if k not in map1:
                return False
            counts2.append(v)

        counts1.sort()
        counts2.sort()
        
        return counts1 == counts2
                    
        