# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        hq = []

        while curr:
            heapq.heappush(hq, curr.val)
            curr = curr.next

        curr = head

        while hq:
            curr.val = heappop(hq)
            curr = curr.next
        
        return head