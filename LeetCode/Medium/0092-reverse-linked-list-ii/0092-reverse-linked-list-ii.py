# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        if left == right:
            return head

        dummy = ListNode()
        dummy.next = head
        pre = dummy

        for i in range(left-1):
            pre = pre.next
        
        curr = pre.next
        prev = None

        for i in range(right-left+1):
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        
        pre.next.next = curr
        pre.next = prev

        return dummy.next

        