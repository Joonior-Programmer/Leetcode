# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findSecondMinimumValue(self, root: Optional[TreeNode]) -> int:
        did = set()
        first = [float("inf")]
        second = [float("inf")]
        
        
        def dfs(node):
            if not node:
                return
            
            if node.val not in did:
                if node.val < first[0]:
                    second[0] = first[0]
                    first[0] = node.val
                elif node.val < second[0]:
                    second[0] = node.val
                did.add(node.val)
                
            dfs(node.left)
            dfs(node.right)
        
        dfs(root)

        if len(did) == 1:
            return -1
        
        return second[0]