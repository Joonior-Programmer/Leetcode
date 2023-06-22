# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head

        odd_head = head
        odd_tail = head
        even_head = head.next
        even_tail = head.next
        curr = head.next.next
        i = 1

        while curr:
            if i % 2 == 0:
                even_tail.next = curr
                even_tail = even_tail.next
            else:
                odd_tail.next = curr
                odd_tail = odd_tail.next
            curr = curr.next
            i += 1

        odd_tail.next = even_head
        even_tail.next = None

        return odd_head
