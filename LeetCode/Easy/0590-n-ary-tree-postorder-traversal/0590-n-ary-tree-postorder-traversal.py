"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def postorder(self, root: 'Node') -> List[int]:
        ret = []

        def post_order(node):
            if not node:
                return
            
            for child in node.children:
                post_order(child)
            
            ret.append(node.val)
        
        post_order(root)

        return ret