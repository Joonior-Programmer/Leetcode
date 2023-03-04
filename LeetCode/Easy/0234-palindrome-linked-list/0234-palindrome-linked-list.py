# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        fast, slow = head, head
        while fast and fast.next:
            fast, slow = fast.next.next, slow.next
        
        prev = None
        while slow:
            _next = slow.next
            slow.next = prev
            prev = slow
            slow = _next
        
        while prev:
            if head.val != prev.val:
                return False
            prev = prev.next
            head = head.next
        return True