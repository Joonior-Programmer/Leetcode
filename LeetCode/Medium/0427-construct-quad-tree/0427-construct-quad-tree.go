/**
 * Definition for a QuadTree node.
 * type Node struct {
 *     Val bool
 *     IsLeaf bool
 *     TopLeft *Node
 *     TopRight *Node
 *     BottomLeft *Node
 *     BottomRight *Node
 * }
 */

func construct(grid [][]int) *Node {
    dfs := func(r, c, length int) *Node { return &Node{true, true, nil, nil, nil, nil} }
    dfs = func(r, c, length int) *Node { 
        if length == 1 { return &Node{grid[r][c] == 1, true, nil, nil, nil, nil} }
        
        val := grid[r][c]
        
        for row := r; row < r + length; row++ {
            for col := c; col < c + length; col++ {
                if val != grid[row][col] {
                    node := &Node{false, false, nil, nil, nil, nil}
                    
                    half := length / 2
                    
                    node.TopLeft = dfs(r, c, half)
                    node.TopRight = dfs(r, c + half, half)
                    node.BottomLeft = dfs(r + half, c, half)
                    node.BottomRight = dfs(r + half, c + half, half)
                    
                    return node
                }
            }
        }
        
        return &Node{grid[r][c] == 1, true, nil, nil, nil, nil}
    }
    
    return dfs(0, 0, len(grid))
}