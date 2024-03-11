class Solution:
    def customSortString(self, order: str, s: str) -> str:
        count = Counter(s)
        ret = [""] * len(s)
        i = 0

        for v in order:
            for j in range(count[v]):
                ret[i] = v
                i += 1
            count[v] = 0

        for v in count:
            for j in range(count[v]):
                ret[i] = v
                i += 1

        return "".join(ret)
        
        