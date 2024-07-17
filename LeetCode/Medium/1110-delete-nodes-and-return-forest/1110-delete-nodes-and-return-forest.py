# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def delNodes(self, root: Optional[TreeNode], to_delete: List[int]) -> List[TreeNode]:
        ret = []
        to_delete = set(to_delete)

        def dfs(node, is_root):
            if not node:
                return None

            if is_root and node.val not in to_delete:
                ret.append(node)
                        
            node.left = dfs(node.left, node.val in to_delete)
            node.right = dfs(node.right, node.val in to_delete)

            return None if node.val in to_delete else node

        dfs(root, root.val not in to_delete)
        
        return ret