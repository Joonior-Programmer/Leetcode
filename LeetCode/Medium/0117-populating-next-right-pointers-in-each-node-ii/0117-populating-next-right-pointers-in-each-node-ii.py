"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root:
            return None

        q = deque()
        q.append(root)

        while q:
            temp_q = deque()
            prev = None
            
            while q:
                node = q.pop()
                node.next = prev
                prev = node
                if node.right:
                    temp_q.appendleft(node.right)
                if node.left:
                    temp_q.appendleft(node.left)

            q = temp_q
        return root

        
        