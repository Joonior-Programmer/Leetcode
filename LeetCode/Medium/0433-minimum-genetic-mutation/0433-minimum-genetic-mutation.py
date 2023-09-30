class Solution:
    def minMutation(self, startGene: str, endGene: str, bank: List[str]) -> int:
        ret = 1
        remained = set(bank)
        stack = [startGene]

        while stack:
            temp_stack = []
            while stack:
                curr = stack.pop()
                
                for i in range(8):
                    for v in "ACGT":
                        temp = curr[:i] + v + curr[i+1:]
                        
                        if temp in remained:
                            if temp == endGene:
                                return ret
                                
                            remained.remove(temp)
                            temp_stack.append(temp)
            ret += 1
            stack = temp_stack

        return -1