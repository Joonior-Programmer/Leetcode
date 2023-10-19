/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {
    int[][] grid;
    public Node construct(int[][] grid) {
        this.grid = grid;

        return dfs(0, 0, grid.length);
    }

    private Node dfs(int r, int c, int length){
        if (length == 1) return new Node(grid[r][c] == 1, true);

        int val = grid[r][c];

        for (int row = r; row < r + length; ++row){
            for (int col = c; col < c + length; ++col){
                if (grid[row][col] != val){
                    Node node = new Node();

                    int half = length / 2;
                    node.topLeft = dfs(r, c, half);
                    node.topRight = dfs(r, c + half ,half);
                    node.bottomLeft = dfs(r + half, c, half);
                    node.bottomRight = dfs(r + half, c + half, half);

                    return node;
                }
            }
        }

        return new Node(grid[r][c] == 1, true);
    }
}