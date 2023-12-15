class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        a = set()
        b = set()

        for v0, v1 in paths:
            a.add(v0)
            b.add(v1)
        
        return list(b-a)[0]