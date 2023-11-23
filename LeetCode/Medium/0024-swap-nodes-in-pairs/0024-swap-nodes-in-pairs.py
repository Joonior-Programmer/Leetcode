# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        
        curr = dummy
        
        while head:
            if head.next:
                temp = head.next.next
                curr.next = head.next
                curr.next.next = head
                curr.next.next.next = None
                head = temp
            else:
                curr.next = head
                head = None
            curr = curr.next.next
        
        return dummy.next
        
        