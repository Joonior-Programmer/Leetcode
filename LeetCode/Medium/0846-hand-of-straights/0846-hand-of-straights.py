class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        hand.sort()
        
        n = len(hand)
        i = 0
        count = defaultdict(int)
        
        while i < n:
            val = hand[i]
            temp = 0
            while i < n and val == hand[i]:
                temp += 1
                i += 1
            
            count[val] = temp
            
            if count[val-groupSize+1]:
                deduct = count[val-groupSize+1]
                for j in range(val - groupSize + 1, val + 1):
                    count[j] -= deduct
        
        for v in count.values():
            if v:
                return False
            
        return True