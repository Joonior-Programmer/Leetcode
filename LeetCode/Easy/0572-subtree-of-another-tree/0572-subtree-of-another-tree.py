# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        ret = False
        
        def DFS(node):
            if not node:
                return False
            
            if node.val == subRoot.val:
                nonlocal ret
                ret = ret or isSameTree(node, subRoot)
            
            DFS(node.left)
            DFS(node.right)

            return ret
            
        def isSameTree(node, subNode):
            if not node and not subNode:
                return True
            elif not node and subNode or node and not subNode:
                return False
            
            return node.val == subNode.val and isSameTree(node.left, subNode.left) and isSameTree(node.right, subNode.right) 

        DFS(root)

        return ret
            