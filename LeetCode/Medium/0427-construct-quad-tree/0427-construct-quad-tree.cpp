/*
// Definition for a QuadTree node.
class Node {
public:
    bool val;
    bool isLeaf;
    Node* topLeft;
    Node* topRight;
    Node* bottomLeft;
    Node* bottomRight;
    
    Node() {
        val = false;
        isLeaf = false;
        topLeft = NULL;
        topRight = NULL;
        bottomLeft = NULL;
        bottomRight = NULL;
    }
    
    Node(bool _val, bool _isLeaf) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = NULL;
        topRight = NULL;
        bottomLeft = NULL;
        bottomRight = NULL;
    }
    
    Node(bool _val, bool _isLeaf, Node* _topLeft, Node* _topRight, Node* _bottomLeft, Node* _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/

class Solution {
public:
    vector<vector<int>> grid;
    Node* construct(vector<vector<int>>& grid) {
        this->grid = grid;
        
        return dfs(0, 0, grid.size());
    }
    
    Node* dfs(int r, int c, int length){
        if (length == 1) return new Node(grid[r][c] == 1, true);
        
        int val = grid[r][c];
        
        for (int row = r; row < r + length; ++row){
            for (int col = c; col < c + length; ++col){
                if (val != grid[row][col]){
                    Node* node = new Node();
                    
                    int half = length / 2;
                    
                    node->topLeft = dfs(r, c, half);
                    node->topRight = dfs(r, c + half, half);
                    node->bottomLeft = dfs(r + half, c, half);
                    node->bottomRight = dfs(r + half, c + half, half);
                    
                    return node;
                }
            }
        }
        
        return new Node(grid[r][c] == 1, true);
    }
};