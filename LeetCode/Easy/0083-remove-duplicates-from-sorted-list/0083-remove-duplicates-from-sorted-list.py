# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        curr = head.next
        prev = head
        
        while curr:
            while curr and curr.val == prev.val:
                curr = curr.next
            prev.next = curr
            prev = prev.next
            if curr:
                curr = curr.next
        return head
