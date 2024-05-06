# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        
        curr = head.next
        stack = [head]

        while curr:
            while stack and stack[-1].val < curr.val:
                stack.pop()
            stack.append(curr)
            curr = curr.next

        stack.reverse()
        curr = dummy

        while stack:
            curr.next = stack.pop()
            curr = curr.next

        return dummy.next
            
            

            
                    