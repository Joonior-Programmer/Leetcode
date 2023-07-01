# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        lookup = defaultdict(int)
        lookup[0] = 1

        def DFS(node, currSum):
            count = 0
            
            if node:
                currSum += node.val
                count = lookup[currSum - targetSum]
                lookup[currSum] += 1
                count += DFS(node.left, currSum) + DFS(node.right, currSum)
                lookup[currSum] -= 1

            return count
        
        return DFS(root, 0)