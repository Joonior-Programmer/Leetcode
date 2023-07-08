# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        ret = []

        q = deque()

        if root:
            q.append(root)

        while q:
            ret.append(q[-1].val)
            
            temp_q = deque()

            while q:
                temp = q.popleft()

                if temp.left:
                    temp_q.append(temp.left)
                if temp.right:
                    temp_q.append(temp.right)

            q = temp_q

        return ret