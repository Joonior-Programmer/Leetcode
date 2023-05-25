# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        def DFS(node, ret):
            if not node:
                return ret
            if not node.left and not node.right:
                ret.append(node.val)
            DFS(node.left, ret)
            DFS(node.right, ret)
            return ret
        return DFS(root1, []) == DFS(root2, [])