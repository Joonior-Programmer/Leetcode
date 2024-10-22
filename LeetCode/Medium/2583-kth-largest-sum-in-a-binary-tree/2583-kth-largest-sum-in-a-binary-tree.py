# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthLargestLevelSum(self, root: Optional[TreeNode], k: int) -> int:
        ret = []
        q = [root]
        
        while q:
            temp_q = []
            temp_ret = 0
            
            while q:
                v = q.pop()
                
                temp_ret += v.val
                
                if v.left:
                    temp_q.append(v.left)
                if v.right:
                    temp_q.append(v.right)
            
            ret.append(temp_ret)
            q = temp_q
        
        if k > len(ret):
            return -1

        ret.sort(reverse=True)
        
        return ret[k-1]