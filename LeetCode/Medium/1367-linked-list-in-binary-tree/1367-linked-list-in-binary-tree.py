# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubPath(self, head: Optional[ListNode], root: Optional[TreeNode]) -> bool:
        def dfs(treeNode, listNode):
            if not listNode:
                return True
            if not treeNode:
                return False
            
            if treeNode.val == listNode.val:
                return dfs(treeNode.left, listNode.next) or dfs(treeNode.right, listNode.next)

            return False

        def create_dfs(node):
            if not node:
                return False
            if dfs(node, head):
                return True
            return create_dfs(node.left) or create_dfs(node.right)
        
        return create_dfs(root)