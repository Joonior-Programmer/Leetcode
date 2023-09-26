"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if not node:
            return
        
        ret = {}

        ret[1] = Node(node.val)
        next_stack = [node]

        while next_stack:
            temp = next_stack.pop()
            for v in temp.neighbors:
                if v.val not in ret:
                    ret[v.val] = Node(v.val)
                    next_stack.append(v)
                ret[temp.val].neighbors.append(ret[v.val]) 
            
        return ret[1]