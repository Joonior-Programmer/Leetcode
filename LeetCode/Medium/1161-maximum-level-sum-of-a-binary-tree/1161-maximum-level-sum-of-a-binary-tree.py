# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        q = [root]
        ret = 0
        cur = 0
        max_sum = float("-inf")

        while q:
            cur += 1
            temp = []
            temp_sum = 0
            
            while q:
                node = q.pop()
                temp_sum += node.val
                if node.left:
                    temp.append(node.left)
                if node.right:
                    temp.append(node.right)

            if temp_sum > max_sum:
                ret = cur
                max_sum = temp_sum
            q = temp

        return ret
                
