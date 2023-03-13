class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        i = 0
        while i < len(haystack):
            if haystack[i] == needle[0]:
                is_equal = True
                is_exist = False
                temp = i
                if i + len(needle) > len(haystack):
                    return -1
                for j in range(1, len(needle)):
                    if not is_exist and haystack[i+j] == needle[0]:
                        temp = i + j - 1
                        is_exist = True
                    if haystack[i+j] != needle[j]:
                        if not is_exist:
                            temp = i + j
                        is_equal = False
                        break
                if is_equal:
                    return i
                i = temp
            i += 1
        return -1
