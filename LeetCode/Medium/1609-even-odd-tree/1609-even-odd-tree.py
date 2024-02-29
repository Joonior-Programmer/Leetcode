# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isEvenOddTree(self, root: Optional[TreeNode]) -> bool:
        if not root.val % 2:
            return False
        stack = [root]
        prev = 0
        i = 0
        is_odd = False
        
        while i < len(stack):
            prev = stack[i].val
            for j in range(i, len(stack)):
                curr = stack[j]
                
                if is_odd and curr.val % 2:
                    return False
                elif not is_odd and not curr.val % 2:
                    return False

                if i != j:
                    if is_odd and prev <= curr.val:
                        return False
                    elif not is_odd and prev >= curr.val:
                        return False

                if curr.left:
                    stack.append(curr.left)
                if curr.right:
                    stack.append(curr.right)
                
                prev = curr.val
                
            i = j + 1
            is_odd = not is_odd
        
        return True