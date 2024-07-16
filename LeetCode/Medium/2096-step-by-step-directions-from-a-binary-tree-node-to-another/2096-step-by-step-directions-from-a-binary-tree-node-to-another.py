# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getDirections(self, root: Optional[TreeNode], startValue: int, destValue: int) -> str:
        def lca(node):
            if not node:
                return None
            
            if node.val == startValue or node.val == destValue:
                return node
            
            l = lca(node.left)
            r = lca(node.right)

            if l and r:
                return node
            elif l:
                return l
            else:
                return r

        def search(node, v, curr):
            if not node:
                return False

            if node.val == v:
                return True

            curr.append("L")
            l = search(node.left, v, curr)

            if l:
                return True

            curr.pop()

            curr.append("R")
            r = search(node.right, v, curr)

            if r:
                return True
            
            curr.pop()

            return False

        lca = lca(root)
        s = []
        d = []
        search(lca, startValue, s)
        search(lca, destValue, d)

        return "U" * len(s) + "".join(d)