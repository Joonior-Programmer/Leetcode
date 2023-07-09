class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        # q = [key for key in rooms[0]]
        # visit = set([0] + q)
        
        # while q:
        #     temp_q = []
            
        #     while q:
        #         temp = q.pop()
                
        #         for v in rooms[temp]:
        #             if v not in visit:
        #                 temp_q.append(v)
        #                 visit.add(v)
            
        #     q = temp_q

        # return len(visit) == len(rooms)


        visited = set()

        def dfs(room):
            visited.add(room)

            for key in rooms[room]:
                if key not in visited:
                    dfs(key)
        
        dfs(0)
        return len(visited) == len(rooms)

                