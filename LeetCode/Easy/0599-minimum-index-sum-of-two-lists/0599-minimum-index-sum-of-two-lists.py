class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        exist = {}

        temp = [[] for i in range(len(list1) + len(list2))]

        for i in range(len(list1)):
            exist[list1[i]] = i
        
        for i in range(len(list2)):
            if list2[i] in exist:
                temp[exist[list2[i]] + i].append(list2[i])

        for v in temp:
            if v:
                return v
        