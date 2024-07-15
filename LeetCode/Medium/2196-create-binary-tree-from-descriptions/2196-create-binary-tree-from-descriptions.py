# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def createBinaryTree(self, descriptions: List[List[int]]) -> Optional[TreeNode]:
        nodes = {}
        child = set()
        ret = None

        for v0, v1, v2 in descriptions:
            if v0 not in nodes:
                nodes[v0] = TreeNode(v0)
            if v1 not in nodes:
                nodes[v1] = TreeNode(v1)
            
            child.add(v1)

            if v2:
                nodes[v0].left = nodes[v1]
            else:
                nodes[v0].right = nodes[v1]
        
        for k in nodes.keys():
            if k not in child:
                ret = k
                break

        return nodes[ret]