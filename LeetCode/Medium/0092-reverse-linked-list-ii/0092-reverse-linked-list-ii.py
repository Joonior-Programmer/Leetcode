# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        if left == right:
            return head

        conn_head = head
        conn_tail = head
        change_head = head
        change_tail = head
        i = 1

        while i < left-1:
            conn_head = conn_head.next
            conn_tail = conn_tail.next
            change_head = change_head.next
            change_tail = change_tail.next
            i += 1
        
        conn_tail = conn_tail.next

        if left != 1:
            change_head = change_head.next
        prev = None

        while i < right:
            temp = change_tail.next
            conn_tail = temp.next
            change_tail.next = prev
            prev = change_tail
            change_tail = temp
            i += 1

        change_tail.next = prev
        conn_head.next = change_tail
        change_head.next = conn_tail

        if left == 1:
            return change_tail
            
        return head
        