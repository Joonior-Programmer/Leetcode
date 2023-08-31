class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ret = defaultdict(list)
        for v in strs:
            ret["".join(sorted(v))].append(v)

        return ret.values()