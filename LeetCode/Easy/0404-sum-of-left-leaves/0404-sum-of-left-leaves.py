# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        
        def DFS(node):
            if not node:
                return 0
            temp = 0
            if node.left and not node.left.left and not node.left.right:
                temp += node.left.val
                temp += DFS(node.right)
            else:
                temp += DFS(node.left)
                temp += DFS(node.right)
            return temp

        return DFS(root)
            