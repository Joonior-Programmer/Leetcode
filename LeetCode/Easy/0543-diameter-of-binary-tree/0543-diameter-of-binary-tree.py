# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    ans = 0
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        def DFS(node):
            if not node:
                return 0
            l = DFS(node.left)
            r = DFS(node.right)
            self.ans = max(self.ans, l + r)
            return max(l, r) + 1
        DFS(root)
        return self.ans