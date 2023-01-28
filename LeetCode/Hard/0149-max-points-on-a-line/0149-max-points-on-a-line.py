class Solution:
    def maxPoints(self, points: List[List[int]]) -> int:
        # result = 1
        # for i in range(len(points)):
        #     for j in range(len(points)):
        #         if i == j:
        #             continue
        #         distance = [points[i][0] - points[j][0], points[i][1] - points[j][1]]
        #         temp_value = copy.deepcopy(points[i])
        #         temp = 1
        #         while [temp_value[0] - distance[0], temp_value[1] - distance[1]] in points:
        #             temp_value[0] -= distance[0]
        #             temp_value[1] -= distance[1]
        #             temp += 1
        #         if temp > result:
        #             result = temp

        # return result
        if not points:
            return 0
        if len(points) == 1:
            return 1
        
        result = 2
        length = len(points)
        for i in range(length):
            if i > length - result:
                break
            count = {}
            count[i] = {}
            slope = float("inf")
            for j in range(i + 1, length):
                if points[i][0] - points[j][0] == 0:
                    slope = float("inf")
                else:
                    slope = (points[i][1] - points[j][1]) / (points[i][0] - points[j][0])
                if slope in count[i]:
                    count[i][slope] += 1
                else:
                    count[i][slope] = 2
            for v in count[i].values():
                if result < v:
                    result = v
        return result