# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        check_exist = set()
        curr = head
        while curr:
            if curr in check_exist:
                return True
            check_exist.add(curr)
            curr = curr.next
        return False