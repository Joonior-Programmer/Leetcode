# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def addOneRow(self, root: Optional[TreeNode], val: int, depth: int) -> Optional[TreeNode]:
        if depth == 1:
            return TreeNode(val, root)

        def dfs(node, curr):
            if not node:
                return

            if curr == depth:
                l, r = node.left, node.right
                new_l, new_r = TreeNode(val, left=l), TreeNode(val, right=r)
                new_l.left, new_r.right = l, r
                node.left, node.right = new_l, new_r
                return
            else:
                dfs(node.left, curr + 1)
                dfs(node.right, curr + 1)
        
        dfs(root, 2)
        
        return root