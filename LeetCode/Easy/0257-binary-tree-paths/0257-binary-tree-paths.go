/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func binaryTreePaths(root *TreeNode) []string {
    ret := make([]string, 0)
    var b bytes.Buffer
    inOrder(root, b, &ret)
    return ret
}

func inOrder(node *TreeNode, b bytes.Buffer, ret *[]string) {
    b.WriteString(strconv.Itoa(node.Val))
    if (node.Left == nil && node.Right == nil){
        *ret = append(*ret, b.String())
        return
    }
    b.WriteString("->")
    if node.Left != nil {inOrder(node.Left, bytes.Buffer(b), ret)}
    if node.Right != nil {inOrder(node.Right, bytes.Buffer(b), ret)}
}