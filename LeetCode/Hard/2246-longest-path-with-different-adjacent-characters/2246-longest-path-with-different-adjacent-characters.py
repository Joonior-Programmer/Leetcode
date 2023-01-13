class Solution:
    result = 0
    def longestPath(self, parent: List[int], s: str) -> int:
        tree = [[] for i in range(len(parent))]
        
        for i in range(1, len(parent)):
            tree[parent[i]].append(i)

        # def DFS(current, count):
        #     temp_arr = []
        #     temp_arr_len = 0
        #     for v in tree[current]:
        #         if s[v] == s[current]:
        #             temp = DFS(v, 1)
        #             if temp + 1 > self.result:
        #                 self.result = temp + 1
        #         else:
        #             temp_arr.append(DFS(v, count + 1) - 1)
        #             temp_arr_len += 1
        #     temp_arr.sort(reverse=True)
        #     result = 0
        #     print(current, temp_arr, count)
        #     if len(temp_arr) > 1:
        #         count = temp_arr[0] + temp_arr[1]
        #     elif len(temp_arr) == 1:
        #         count = temp_arr[0]
        #     # count = temp_arr[0] + temp_arr[1]
        #     print(current, temp_arr,count)
        #     return count
        
        def DFS(current):
            max1 = 0
            max2 = 0
            for v in tree[current]:
                temp = DFS(v)
                if s[v] == s[current]: continue
                if temp > max1:
                    max2 = max1
                    max1 = temp
                elif temp > max2:
                    max2 = temp    
            if self.result < max1 + max2 + 1:
                self.result = max1 + max2 + 1
            return max1 + 1

        DFS(0)

        return self.result