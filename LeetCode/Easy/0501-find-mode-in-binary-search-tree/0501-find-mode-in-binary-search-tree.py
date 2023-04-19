# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        count = defaultdict(int)
        max_val = 0
        def DFS(node:Optional[TreeNode]):
            if not node:
                return

            count[node.val] += 1
            DFS(node.left)
            DFS(node.right)
        
        DFS(root)

        for v in count.values():
            if v > max_val:
                max_val = v

        return [k for k, v in count.items() if v == max_val]