# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        container = []
        
        curr = head
        
        while curr:
            container.append(curr)
            curr = curr.next

        if len(container) - n == 0 and len(container) == 1:
            return None

        if len(container) - n == 0:
            return container[1]
            
        if n != 1:
            container[len(container)-n-1].next = container[len(container)-n+1]
        else:
            container[len(container)-2].next = None

        return head
        