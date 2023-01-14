class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # shortest = ""
        # shortest_len = float("inf")
        # result = ""

        # for i, v in enumerate(strs):
        #     if len(v) < shortest_len:
        #         shortest = v
        #         shortest_len = len(v)
        
        # for i in range(shortest_len):
        #     temp = shortest[i]
        #     condition = True
        #     for v in strs:
        #         if shortest == v:
        #             continue
        #         if v[i] != temp:
        #             condition = False
        #             break
        #     if condition:
        #         result += temp
        #     else:
        #         break
        # return result
            
        prefix = strs[0]
        for v in strs[1:]:
            while not v.startswith(prefix):
                prefix = prefix[:-1]
        return prefix
        
        
