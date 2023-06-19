# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        prev = head = TreeNode()
        head.left = curr = root
        is_left = True

        while curr and curr.val != key:
            prev = curr
            if curr.val > key:
                curr = curr.left
                is_left = True
            else:
                curr = curr.right
                is_left = False
        
        if not curr:
            return root
        
        if not curr.right:
            if is_left:
                prev.left = curr.left
            else:
                prev.right = curr.left
        else:
            temp = curr.right

            while temp.left:
                temp = temp.left

            temp.left = curr.left
            if is_left:
                prev.left = curr.right
            else:
                prev.right = curr.right

        return head.left