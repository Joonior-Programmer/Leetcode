# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        slow = dummy
        fast = head
        prev = dummy
        next_prev = prev
        curr = head
        
        while curr:
            count = 1
            
            while curr.next and count < k:
                curr = curr.next
                count += 1

            if curr:
                curr = curr.next

            if count == k:
                slow = prev
                next_prev = fast
                
                while count > 0:
                    temp = fast.next
                    fast.next = slow
                    slow = fast
                    fast = temp
                    count -= 1
    
                prev.next.next = fast
                prev.next = slow
                prev = next_prev
                slow = prev
        
        return dummy.next