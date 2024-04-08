class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        count = [0] * 2
        n = len(sandwiches)
        
        for s in students:
            count[s] += 1
            
        for v in sandwiches:
            if not count[v]:
                break
            
            count[v] -= 1
            n -= 1
        
        return n
            