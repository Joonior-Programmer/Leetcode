# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        def DFS(node, depth):
            if not node:
                return depth - 1
            
            left = DFS(node.left, depth + 1)
            right = DFS(node.right, depth + 1)

            if left == depth:
                return right
            elif right == depth:
                return left

            return min(left, right)

        return DFS(root, 1)