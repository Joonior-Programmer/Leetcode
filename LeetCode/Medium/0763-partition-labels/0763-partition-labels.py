class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        n = len(s)
        idxs = [[] for i in range(26)]

        for i in range(n):
            idxs[ord(s[i])-97].append(i)
        
        start = idxs[ord(s[0])-97][0]
        end = idxs[ord(s[0])-97][-1]
        ret = []

        for i, v in enumerate(s):
            idx = ord(v) - 97
            if end < idxs[idx][0]:
                ret.append(end - start + 1)
                start = idxs[idx][0]
                end = idxs[idx][-1]
            elif end >= idxs[idx][-1]:
                continue
            else:
                end = idxs[idx][-1]
        
        ret.append(end-start+1)

        return ret
            
        
            