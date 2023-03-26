class Solution:
    def firstUniqChar(self, s: str) -> int:
        is_exist = [float("inf")] * 26
        exist = len(s) + 1
        ret = 0
        for i in range(len(s)):
            location = ord(s[i]) - 97
            if is_exist[location] != len(s) + 1 and is_exist[location] == float("inf"): 
                is_exist[location] = i
            elif is_exist[location] != float("inf"):
                is_exist[location] = exist
        return min(is_exist) if min(is_exist) != exist else -1
        

                
            