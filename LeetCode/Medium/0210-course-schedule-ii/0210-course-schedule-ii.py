class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        ret = []
        req = [[] for i in range(numCourses)]

        for v0, v1 in prerequisites:
            req[v1].append(v0)

        visited = set()
        added = set()

        def dfs(course):
            if course in visited:
                return False
            if not req[course]:
                if course not in added:
                    ret.append(course)
                    added.add(course)
                return True
            
            visited.add(course)

            for v in req[course]:
                if not dfs(v):
                    return False
            
            visited.remove(course)
            added.add(course)
            ret.append(course)
            req[course] = []

            return True

        for i in range(numCourses):
            if not dfs(i):
                return []

        return reversed(ret)