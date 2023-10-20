# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if not lists:
            return None
        if len(lists) == 1:
            return lists[0]
        
        mid = len(lists) // 2

        l1 = self.mergeKLists(lists[:mid])
        l2 = self.mergeKLists(lists[mid:])

        def merge(l1, l2):
            dummy = ListNode()

            curr = dummy

            while l1 and l2:
                if l1.val < l2.val:
                    curr.next = l1
                    l1, curr = l1.next, curr.next
                else:
                    curr.next = l2
                    l2, curr = l2.next, curr.next
            
            if l1:
                curr.next = l1
            if l2:
                curr.next = l2
            
            return dummy.next

        return merge(l1, l2)

        # count = [0] * 20001
        # dummy = ListNode()
        
        # for v in lists:
        #     curr = v
        #     while curr:
        #         count[curr.val+10000] += 1
        #         curr = curr.next
        
        # curr = dummy
        # for v in range(20001):
        #     while count[v] > 0:
        #         curr.next = ListNode(v - 10000)
        #         curr = curr.next
        #         count[v] -= 1
            
        # return dummy.next
        