# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        curr = []
        power = 0
        ret = 0

        def dfs(node):
            if not node:
                return
            curr.append(node.val)
            dfs(node.next)
        
        dfs(head)

        while curr:
            ret += curr.pop() * (2 ** power)
            power += 1
            
        return ret


            
