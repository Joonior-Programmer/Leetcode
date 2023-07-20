class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        dial = {
            "2": "abc",
            "3" : "def",
            "4" : "ghi",
            "5" : "jkl",
            "6" : "mno",
            "7" : "pqrs",
            "8": "tuv",
            "9": "wxyz",
        }
        
        n = len(digits)
        
        ret = []

        def DFS(curr, left_digits):
            if not left_digits:
                if curr:
                    ret.append(curr)
                return

            for v in dial[left_digits[0]]:
                DFS(curr + v, left_digits[1:])
        
        DFS("", digits)
    
        return ret
