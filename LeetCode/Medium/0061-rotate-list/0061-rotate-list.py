# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head

        length = 0
        curr = head
        
        while curr:
            length += 1
            curr = curr.next

        if not length:
            return head
        
        k %= length

        if not k:
            return head

        slow = dummy
        fast = head

        while k < length:
            slow = slow.next
            fast = fast.next
            k += 1
        
        slow.next = None
        dummy.next = fast

        while fast.next:
            fast = fast.next

        fast.next = head

        return dummy.next
        