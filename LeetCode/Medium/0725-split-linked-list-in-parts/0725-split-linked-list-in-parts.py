# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:
        length = 0
        curr = head

        while curr:
            length += 1
            curr = curr.next

        part_size = length // k
        extra_nodes = length % k

        curr = head
        ret = []

        for i in range(k):
            part_head = curr
            current_part_size = part_size + (1 if extra_nodes > 0 else 0)
            extra_nodes -= 1
            
            for j in range(current_part_size - 1):
                if curr:
                    curr = curr.next
            
            if curr:
                next_part_head = curr.next
                curr.next = None
                curr = next_part_head
            
            ret.append(part_head)
        
        return ret