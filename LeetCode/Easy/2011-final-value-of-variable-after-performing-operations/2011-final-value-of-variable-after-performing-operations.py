class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        ret = 0
        
        for operation in operations:
            if operation[0] == "+" or operation[2] == "+":
                ret += 1
            else:
                ret -= 1
        
        return ret