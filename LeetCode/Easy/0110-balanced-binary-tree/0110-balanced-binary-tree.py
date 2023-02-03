# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isBalanced(self, root):
        if not root:
            return True
        
        def checkDepth(node):
            if not node:
                return 0
            
            left = checkDepth(node.left)
            right = checkDepth(node.right)

            if left == -1 or right == -1:
                return -1
            if abs(left - right) > 1:
                return -1
            return max(left, right) + 1
            
        return checkDepth(root) != -1
            
            
        
