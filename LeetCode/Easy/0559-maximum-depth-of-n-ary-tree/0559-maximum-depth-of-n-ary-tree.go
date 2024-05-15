/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Children []*Node
 * }
 */

func maxDepth(root *Node) int {
    dfs := func(node *Node, curr int) int { return 0 }
    dfs = func(node *Node, curr int) int { 
        if node == nil { return curr }
        
        curr++
        ret := curr
        
        for _, v := range node.Children {
            ret = max(ret, dfs(v, curr))
        }
        
        return ret
    }
    
    return dfs(root, 0)
}

func max(a, b int) int {
    if a > b { return a }
    return b
}