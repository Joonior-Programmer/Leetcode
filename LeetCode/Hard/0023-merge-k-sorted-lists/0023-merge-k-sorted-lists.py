# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        count = [0] * 20001
        dummy = ListNode()
        
        for v in lists:
            curr = v
            while curr:
                count[curr.val+10000] += 1
                curr = curr.next
        
        curr = dummy
        for v in range(20001):
            while count[v] > 0:
                curr.next = ListNode(v - 10000)
                curr = curr.next
                count[v] -= 1
            
        return dummy.next
        