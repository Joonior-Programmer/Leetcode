# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    result = float("-inf")
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        self.DFS(root)
        return self.result

    def DFS(self, root):
        if not root:
            return 0
        l = max(0, self.DFS(root.left))
        r = max(0, self.DFS(root.right))
        self.result = max(self.result, l + r + root.val)

        return root.val + max(l, r)