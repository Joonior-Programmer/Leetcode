/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Neighbors []*Node
 * }
 */

func cloneGraph(node *Node) *Node {
    if node == nil { return node }
    
    ret := make([]*Node, 101)
    visited := make([]bool, 101)
    stack := make([]*Node, 1)
    ret[1] = &Node{1, make([]*Node, 0)}
    visited[1] = true
    stack[0] = node
    
    for len(stack) != 0 {
        temp := stack[len(stack)-1]
        stack = stack[:len(stack)-1]
        
        for _, neighbor := range temp.Neighbors {
            if !visited[neighbor.Val] {
                visited[neighbor.Val] = true
                ret[neighbor.Val] = &Node{neighbor.Val, make([]*Node, 0)}
                stack = append(stack, neighbor)
            }
            ret[temp.Val].Neighbors = append(ret[temp.Val].Neighbors, ret[neighbor.Val])
        }
    }
    
    return ret[1]
}