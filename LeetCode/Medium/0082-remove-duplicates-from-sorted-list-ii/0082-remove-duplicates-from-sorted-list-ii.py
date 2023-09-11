# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head

        slow = dummy
        fast = head

        while fast:
            if fast.next and fast.val == fast.next.val:
                while fast.next and fast.val == fast.next.val:
                    fast.next = fast.next.next
                slow.next = fast.next
                fast = fast.next
            else:
                slow = slow.next
                fast = fast.next

        return dummy.next

        