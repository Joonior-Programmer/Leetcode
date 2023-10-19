"""
# Definition for a QuadTree node.
class Node:
    def __init__(self, val, isLeaf, topLeft, topRight, bottomLeft, bottomRight):
        self.val = val
        self.isLeaf = isLeaf
        self.topLeft = topLeft
        self.topRight = topRight
        self.bottomLeft = bottomLeft
        self.bottomRight = bottomRight
"""

class Solution:
    def construct(self, grid: List[List[int]]) -> 'Node':
        def dfs(l, r, t ,b):
            if l == r:
                return Node(val = grid[t][l], isLeaf = True)

            node = Node()
            val = grid[t][l]

            for row in range(t, b+1):
                for col in range(l, r + 1):
                    if val != grid[row][col]:
                        pivot_row = t + (b - t + 1) // 2
                        pivot_col = l + (r - l + 1) // 2
                        node.topLeft = dfs(l, pivot_col - 1, t, pivot_row - 1)
                        node.topRight = dfs(pivot_col, r, t, pivot_row - 1)
                        node.bottomLeft = dfs(l, pivot_col - 1, pivot_row, b)
                        node.bottomRight = dfs(pivot_col, r, pivot_row, b)

                        return node
            
            node.val = val
            node.isLeaf = True

            return node

        n = len(grid) - 1

        root = dfs(0, n, 0, n)

        return root
        