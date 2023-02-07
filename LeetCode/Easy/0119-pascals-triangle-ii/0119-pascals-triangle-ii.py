class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        ret = [1]
        for i in range(1, rowIndex+1):
            temp = copy.deepcopy(ret)
            for j in range(1, i+1):
                if i == j:
                    ret.append(1)
                else:
                    ret[j] += temp[j-1]
        return ret