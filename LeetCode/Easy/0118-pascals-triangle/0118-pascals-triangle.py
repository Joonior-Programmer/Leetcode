class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ret = [[1]]
        curr = 1
        for i in range(2,numRows+1):
            temp = [1]
            for j in range(1, i):
                if j == curr:
                    temp.append(1)
                else:
                    temp.append(ret[-1][j-1] + ret[-1][j])
            ret.append(temp)
            curr += 1
        return ret
