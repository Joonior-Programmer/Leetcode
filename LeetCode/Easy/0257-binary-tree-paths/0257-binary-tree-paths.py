# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        ret = []

        def in_order(node, s):
            if not node:
                return
            if not node.left and not node.right:
                if not s:
                    ret.append(str(node.val))
                else:
                    ret.append(s + "->" + str(node.val))
                return
            if not s:
                s = str(node.val)
            else:
                s += "->" + str(node.val)
            in_order(node.left, s)
            in_order(node.right, s)
        in_order(root, None)
        return ret
            