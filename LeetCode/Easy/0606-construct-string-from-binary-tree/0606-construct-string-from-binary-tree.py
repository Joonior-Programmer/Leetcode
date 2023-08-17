# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        ret = []

        def pre_order(node):
            if not node:
                return

            if node:
                ret.append(str(node.val))
            if node.left:
                ret.append("(")
                pre_order(node.left)
                ret.append(")")
            elif node.right:
                ret.append("()(")
                pre_order(node.right)
                ret.append(")")
            if node.left and node.right:
                ret.append("(")
                pre_order(node.right)
                ret.append(")")

        pre_order(root)

        return "".join(ret)
