# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        small_dummy = ListNode()
        big_dummy = ListNode()

        small_dummy_head = small_dummy
        big_dummy_head = big_dummy

        while head:
            if head.val < x:
                small_dummy.next = head
                small_dummy = head
            else:
                big_dummy.next = head
                big_dummy = head
            head = head.next

        small_dummy.next = big_dummy_head.next
        big_dummy.next = None

        return small_dummy_head.next