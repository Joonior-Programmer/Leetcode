# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr = head
        
        while curr.next:
            temp_node = ListNode(math.gcd(curr.val, curr.next.val))
            temp_node.next = curr.next
            curr.next = temp_node
            curr = curr.next.next
        
        return head