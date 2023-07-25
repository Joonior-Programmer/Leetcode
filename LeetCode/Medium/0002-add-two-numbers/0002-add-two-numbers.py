# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        ret = ListNode()
        curr = ret
        currSum = 0
        while l1 and l2:
            currSum += l1.val + l2.val
            curr.next = ListNode(currSum % 10)
            currSum = currSum // 10 
            l1 = l1.next
            l2 = l2.next
            curr = curr.next
        
        while l1:
            currSum += l1.val
            curr.next = ListNode(currSum % 10)
            currSum = currSum // 10
            l1 = l1.next
            curr = curr.next
        
        while l2:
            currSum += l2.val
            curr.next = ListNode(currSum % 10)
            currSum = currSum // 10
            l2 = l2.next
            curr = curr.next
        
        if currSum:
            curr.next = ListNode(currSum)

        return ret.next
        
