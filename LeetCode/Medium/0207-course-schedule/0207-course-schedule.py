class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        req = [[] for i in range(numCourses)]

        for v0, v1 in prerequisites:
            req[v0].append(v1)
        
        visited = set()

        def dfs(course):
            if course in visited:
                return False
            if not req[course]:
                return True
            
            visited.add(course)

            for next in req[course]:
                if not dfs(next):
                    return False
            
            visited.remove(course)
            req[course] = []
            
            return True

        for i in range(numCourses):
            if not dfs(i):
                return False

        return True