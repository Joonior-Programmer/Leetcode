# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        def createTree(left, right):
            if left > right:
                return None
            
            node_val = postorder[self.i]
            node = TreeNode(node_val)
            self.i -= 1

            node.right = createTree(inorder_idx[node_val] + 1, right)
            node.left = createTree(left, inorder_idx[node_val] - 1)

            return node

        inorder_idx = {}
        n = len(postorder)
        self.i = n - 1

        for i in range(n):
            inorder_idx[inorder[i]] = i
        
        return createTree(0, n-1)