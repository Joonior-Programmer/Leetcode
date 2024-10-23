# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def replaceValueInTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        sum_level = []
        
        def add_dfs(node, depth):
            if not node:
                return
            
            if len(sum_level) == depth:
                sum_level.append(node.val)
            else:
                sum_level[depth] += node.val
            
            add_dfs(node.left, depth + 1)
            add_dfs(node.right, depth + 1)
            
        def dfs(node, level, children_sum):
            if not node:
                return
            
            node.val = sum_level[level] - children_sum
            
            next_sum = 0
            
            if node.left:
                next_sum += node.left.val
            if node.right:
                next_sum += node.right.val
            
            dfs(node.left, level + 1, next_sum)
            dfs(node.right, level + 1, next_sum)
            
        add_dfs(root, 0)
        dfs(root, 0, root.val)
        
        return root