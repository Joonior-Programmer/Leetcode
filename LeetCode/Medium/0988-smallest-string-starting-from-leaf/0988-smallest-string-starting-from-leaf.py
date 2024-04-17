# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def smallestFromLeaf(self, root: Optional[TreeNode]) -> str:
        vals = []

        def dfs(node, curr):
            if not node.left and not node.right:
                vals.append([node.val] + curr[::-1])
                return

            if node.left:
                dfs(node.left, curr + [node.val])
            if node.right:
                dfs(node.right, curr + [node.val])

        dfs(root, [])
        vals.sort()

        return "".join(chr(v + 97) for v in vals[0])