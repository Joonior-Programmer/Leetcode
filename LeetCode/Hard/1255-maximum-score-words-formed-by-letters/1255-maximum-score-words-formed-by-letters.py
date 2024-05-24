class Solution:
    def maxScoreWords(self, words: List[str], letters: List[str], score: List[int]) -> int:
        n = len(words)
        ret = [0]
        count = Counter(letters)
        
        def dfs(idx, curr, counter):
            if idx == n:
                ret[0] = max(ret[0], curr)
                return
            
            count = Counter(words[idx])
            possible = True
            
            for k, v in count.items():
                if counter[k] < v:
                    possible = False
                
            if possible:
                temp = 0
                for k, v in count.items():
                    temp += score[ord(k) - 97] * v
                    counter[k] -= v

                dfs(idx + 1, curr + temp, counter)
                
                for k, v in count.items():
                    counter[k] += v
                
                dfs(idx + 1, curr, counter)
            else:
                dfs(idx + 1, curr, counter)
        
        dfs(0, 0, count)
        
        return ret[0]
                