# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        ret = [0]

        def dfs(node, sum_num):
            if not node.left and not node.right:
                ret[0] += sum_num * 10 + node.val
                return
            if node.left:
                dfs(node.left, sum_num * 10 + node.val)
            if node.right:
                dfs(node.right, sum_num * 10 + node.val)

        dfs(root, 0)

        return ret[0]