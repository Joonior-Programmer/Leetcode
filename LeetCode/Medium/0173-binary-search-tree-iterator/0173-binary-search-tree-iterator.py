# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class BSTIterator:

    def __init__(self, root: Optional[TreeNode]):
        self.inorder = []
        def dfs(node):
            if not node:
                return
            dfs(node.left)
            self.inorder.append(node.val)
            self.size += 1
            dfs(node.right)
        self.idx = 0
        self.size = 0
        dfs(root)

    def next(self) -> int:
        self.idx += 1
        return self.inorder[self.idx-1]

    def hasNext(self) -> bool:
        return self.idx < self.size
        


# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()