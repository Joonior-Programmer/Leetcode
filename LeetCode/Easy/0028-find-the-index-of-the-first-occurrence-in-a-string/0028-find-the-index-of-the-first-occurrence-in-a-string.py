class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        i = 0
        while i < len(haystack):
            if haystack[i] == needle[0]:
                is_equal = True
                temp = i
                if i + len(needle) > len(haystack):
                    return -1
                for j in range(1, len(needle)):
                    if haystack[i+j] == needle[0]:
                        temp = i + j
                    if haystack[i+j] != needle[j]:
                        is_equal = False
                        break
                if is_equal:
                    return i
            i += 1
        return -1
