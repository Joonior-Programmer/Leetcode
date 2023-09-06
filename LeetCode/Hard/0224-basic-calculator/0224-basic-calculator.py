class Solution:
    nums = set(["0","1","2","3","4","5","6","7","8","9"])
    def calculate(self, s: str) -> int:
        def helper(idx):
            ret = 0
            temp_num = []
            operator = ""
            while idx < len(s):
                if s[idx] in self.nums:
                    temp_num.append(s[idx])
                elif s[idx] == "(":
                    val, idx = helper(idx+1)
                    if operator:
                        if operator == "+":
                            ret += val
                        else:
                            ret -= val
                        operator = ""
                    else:
                        ret = val
                elif s[idx] == ")":
                    if operator == "+":
                        return ret + int("".join(temp_num)), idx
                    elif operator == "-":
                        return ret - int("".join(temp_num)), idx
                    else:
                        if temp_num:
                            return int("".join(temp_num)), idx
                        else:
                            return ret, idx
                elif s[idx] == "+" or s[idx] == "-":
                    if operator:
                        if operator == "+":
                            ret += int("".join(temp_num))
                        else:
                            ret -= int("".join(temp_num))
                    else:
                        if temp_num:
                            ret = int("".join(temp_num))
                    temp_num = []
                    operator = s[idx]
                idx += 1

            if temp_num or operator == "-":
                if operator:
                    if operator == "+":
                        ret += int("".join(temp_num))
                    else:
                        ret -= int("".join(temp_num))
                else:
                    ret = int("".join(temp_num))
            return ret
                
        return helper(0)
                
                


