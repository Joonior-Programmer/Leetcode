"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        random = defaultdict(Node)
        prev = None
        new_head = None
        while head:
            temp_id = id(head)
            temp_random_id = None
            if head.random:
                temp_random_id = id(head.random)
            if temp_id not in random:
                random[temp_id] = Node(head.val)
            if temp_random_id:
                if temp_random_id not in random:
                    random[temp_random_id] = Node(head.random.val)
                random[temp_id].random = random[temp_random_id]
            if prev:
                prev.next = random[temp_id]
            else:
                new_head = random[temp_id]
            prev = random[temp_id]
            head = head.next

        return new_head