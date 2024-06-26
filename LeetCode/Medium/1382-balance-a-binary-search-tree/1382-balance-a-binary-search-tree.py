# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def balanceBST(self, root: TreeNode) -> TreeNode:
        arr = []
        
        def add(node):
            if not node:
                return
            
            add(node.left)
            arr.append(node)
            add(node.right)

        def make(l, r):
            if l > r:
                return

            mid = (l + r) // 2
            parent = arr[mid]
            parent.left = make(l, mid-1)
            parent.right = make(mid+1, r)

            return parent

        add(root)

        return make(0, len(arr)-1)
            