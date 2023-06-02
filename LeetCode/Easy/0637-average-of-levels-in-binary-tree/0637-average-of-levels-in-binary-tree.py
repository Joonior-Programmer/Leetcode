# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        ret = []
        q = [root]
        
        while q:
            temp, next_q = 0, []
            for node in q:
                temp += node.val
                if node.left:
                    next_q.append(node.left)
                if node.right:
                    next_q.append(node.right)
            ret.append(temp / len(q))
            q = next_q  

        return ret
            