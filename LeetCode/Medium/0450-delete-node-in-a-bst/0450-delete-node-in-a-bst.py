# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        prev = None
        curr = root
        is_left = True
        while curr:
            if curr.val == key:
                is_root_change = False
                if not prev:
                    if root.right:
                        root = root.right
                    else:
                        root = root.left
                    is_root_change = True
                    prev = root
                
                if not prev:
                    return None

                temp = None
                new_position = None 

                if curr.right:
                    new_position = curr.right
                    temp = curr.left
                else:
                    new_position = curr.left
                
                if not is_root_change:
                    if is_left:
                        prev.left = new_position
                    else:
                        prev.right = new_position

                if not new_position:
                    break
                    
                while new_position.left:
                    new_position = new_position.left
                
                new_position.left = temp
                break

            elif curr.val > key:
                prev = curr
                curr = curr.left
                is_left = True
            else:
                prev = curr
                curr = curr.right
                is_left = False
        # print(prev, curr)
        return root