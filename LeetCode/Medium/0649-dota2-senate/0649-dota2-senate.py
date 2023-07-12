class Solution:
    def predictPartyVictory(self, senate: str) -> str:
      turn = deque(list(senate))
      r = senate.count("R")
      d = senate.count("D")
      r_skip = 0
      d_skip = 0

      while r and d and turn:
        temp = turn.popleft()
        
        if temp == "R":
          if r_skip:
            r_skip -= 1
            continue
          d -= 1
          d_skip += 1
            
        else:
          if d_skip:
            d_skip -= 1
            continue
          r -= 1
          r_skip += 1
          
        turn.append(temp)

      return "Radiant" if r else "Dire"
      