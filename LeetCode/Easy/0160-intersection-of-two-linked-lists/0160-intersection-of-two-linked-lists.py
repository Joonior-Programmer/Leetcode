# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
#         exist = set()
#         while headA:
#             exist.add(headA)
#             headA = headA.next
        
#         while headB:
#             if headB in exist:
#                 return headB
#             headB = headB.next
        
#         return None
        len_A = 0
        len_B = 0
        cur_A = headA
        cur_B = headB
        while cur_A:
            len_A += 1
            cur_A = cur_A.next
            
        while cur_B:
            len_B += 1
            cur_B = cur_B.next
            
        if len_A > len_B:
            while len_A > len_B:
                headA = headA.next
                len_B += 1
        elif len_B > len_A:
            while len_B > len_A:
                headB = headB.next
                len_A += 1
        
        while headA and headB:
            if headA == headB:
                return headA
            headA = headA.next
            headB = headB.next
        
        return None
                