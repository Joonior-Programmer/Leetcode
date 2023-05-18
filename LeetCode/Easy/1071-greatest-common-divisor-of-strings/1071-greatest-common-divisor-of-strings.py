class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        a = len(str1)
        b = len(str2)

        gcd_a_b = gcd(a, b)

        if str1[:gcd_a_b] == str2[:gcd_a_b] and str1 + str2 == str2 + str1:
            return str1[:gcd_a_b]
        return ""
                
                
        
