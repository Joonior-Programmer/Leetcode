# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        reverse = None
        fast = slow = head
        ret = 0

        while fast:
            temp = slow
            fast = fast.next.next
            slow = slow.next
            temp.next = reverse
            reverse = temp

        while reverse:
            ret = max(ret, reverse.val + slow.val)
            slow = slow.next
            reverse = reverse.next

        return ret