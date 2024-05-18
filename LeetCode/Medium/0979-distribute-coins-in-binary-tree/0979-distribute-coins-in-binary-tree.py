# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def distributeCoins(self, root: Optional[TreeNode]) -> int:
        ret = [0]
        def dfs(node):
            if not node:
                return 0
            
            l, r = dfs(node.left), dfs(node.right)
            node.val += l + r

            ret[0] += abs(node.val - 1)

            return node.val - 1

        dfs(root)

        return ret[0]