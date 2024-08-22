/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Children []*Node
 * }
 */

func postorder(root *Node) []int {
    ret := make([]int, 0)
    
    postOrder := func(node *Node) {}
    postOrder = func(node *Node) {
        if node == nil { return }
        
        for _, child := range node.Children { postOrder(child) }
        
        ret = append(ret, node.Val)
    }
    
    postOrder(root)
    
    return ret
}