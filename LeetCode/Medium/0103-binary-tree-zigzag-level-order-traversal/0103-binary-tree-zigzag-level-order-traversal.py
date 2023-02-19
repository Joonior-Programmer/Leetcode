# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return
        is_left = True
        ret = []
        prev = [root]
        cur = root
        while prev:
            temp = []
            temp_prev = []
            for node in prev:
                temp.append(node.val)
                if node.left:
                    temp_prev.append(node.left)
                if node.right:
                    temp_prev.append(node.right)

            if not is_left:
                temp.reverse()
            ret.append(temp)
            prev = temp_prev
            is_left = not is_left


        return ret


            
