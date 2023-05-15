class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        exist = {}
        ret = [""]
        min_val = float("inf")
        j = 0
        
        for i in range(len(list1)):
            exist[list1[i]] = i
        
        for i in range(len(list2)):
            if list2[i] in exist:
                j = exist[list2[i]]
                if j + i < min_val:
                    ret = ret[:1]
                    ret[0] = list2[i]
                    min_val = i + j
                elif i + j == min_val:
                    ret.append(list2[i])
        return ret