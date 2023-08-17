/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func tree2str(root *TreeNode) string {
    var ret strings.Builder
    
    preOrder(root, &ret)
    
    return ret.String()
}

func preOrder(node *TreeNode, ret *strings.Builder) {
    if node == nil { return }
    
    ret.WriteString(strconv.Itoa(node.Val))
    
    if node.Left != nil {
        ret.WriteString("(")
        preOrder(node.Left, ret)
        ret.WriteString(")")
    } else if node.Right != nil {
        ret.WriteString("()(")
        preOrder(node.Right, ret)
        ret.WriteString(")")
    }
    
    if node.Left != nil && node.Right != nil {
        ret.WriteString("(")
        preOrder(node.Right, ret)
        ret.WriteString(")")
    }
}