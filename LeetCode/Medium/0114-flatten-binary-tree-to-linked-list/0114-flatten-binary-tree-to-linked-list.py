# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        
        dummy = TreeNode()
        
        def post_order(node):
            if not node:
                return
            post_order(node.right)
            post_order(node.left)
            node.right = dummy.right
            node.left = None
            dummy.right = node
        
        post_order(root)
        
        return dummy.right