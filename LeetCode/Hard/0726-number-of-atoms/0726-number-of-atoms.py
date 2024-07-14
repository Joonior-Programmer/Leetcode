class Solution:
    def countOfAtoms(self, formula: str) -> str:
        n = len(formula)
        i = [0]
        ret = []
        
        def helper():
            atom = defaultdict(int)
            curr = []
            count = 0
            
            while i[0] < n:
                if formula[i[0]].isupper():
                    curr.append(formula[i[0]])
                    i[0] += 1
                    
                    while i[0] < n and formula[i[0]].islower():
                        curr.append(formula[i[0]])
                        i[0] += 1
                        
                    while i[0] < n and formula[i[0]].isnumeric():
                        count = count * 10 + int(formula[i[0]])
                        i[0] += 1
                    
                    atom["".join(curr)] += count if count else 1
                    curr = []
                    count = 0
                    
                elif formula[i[0]] == "(":
                    i[0] += 1
                    next_count = helper()
                    
                    while i[0] < n and formula[i[0]].isnumeric():
                        count = count * 10 + int(formula[i[0]])
                        i[0] += 1

                    for k, v in next_count.items():
                        atom[k] += v * count if count else v

                    count = 0
                else:
                    i[0] += 1
                    return atom
            return atom
        
        for v0, v1 in sorted(helper().items()):
            ret.append(v0)
            if v1 > 1:
                ret.append(str(v1))

        return "".join(ret)
                    
                        
                        
            