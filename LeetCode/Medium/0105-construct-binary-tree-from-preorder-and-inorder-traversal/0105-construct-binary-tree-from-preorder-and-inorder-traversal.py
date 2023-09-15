# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        def createTree(left, right):
            if left > right:
                return None

            node_val = preorder[self.i]
            node = TreeNode(node_val)
            self.i += 1

            node.left = createTree(left, inorder_idx[node_val] - 1)
            node.right = createTree(inorder_idx[node_val] + 1, right)

            return node


        preorder_idx = 0

        inorder_idx = defaultdict(int)

        for i, v in enumerate(inorder):
            inorder_idx[v] = i

        self.i = 0

        return createTree(0, len(preorder)-1)