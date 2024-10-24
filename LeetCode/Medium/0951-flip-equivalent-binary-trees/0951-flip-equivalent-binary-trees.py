# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flipEquiv(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        def dfs(node1, node2):
            if not node1 and not node2:
                return True
            elif not node1:
                return False
            elif not node2:
                return False
            
            if node1.val != node2.val:
                return False

            l1, r1 = node1.left.val if node1.left else -1, node1.right.val if node1.right else -1
            l2, r2 = node2.left.val if node2.left else -1, node2.right.val if node2.right else -1

            if l1 == l2:
                return dfs(node1.left, node2.left) and dfs(node1.right, node2.right)
            return dfs(node1.left, node2.right) and dfs(node1.right, node2.left)

        return dfs(root1, root2)