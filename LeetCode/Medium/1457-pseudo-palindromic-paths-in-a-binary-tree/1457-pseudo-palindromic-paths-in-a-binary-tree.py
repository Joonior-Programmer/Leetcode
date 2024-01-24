# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pseudoPalindromicPaths (self, root: Optional[TreeNode]) -> int:
        def dfs(node, curr):
            curr[node.val] += 1
            
            if not node.left and not node.right:
                is_one_exist = False    
                for v in curr:
                    if v % 2 == 1:
                        if is_one_exist:
                            curr[node.val] -= 1
                            return 0
                        is_one_exist = True
                curr[node.val] -= 1
                return 1
            
            ret = 0
            
            
            if node.left:    
                ret += dfs(node.left, curr)
            if node.right:
                ret += dfs(node.right, curr)
            curr[node.val] -= 1
            
            return ret
        
        return dfs(root, [0] * 10)
            