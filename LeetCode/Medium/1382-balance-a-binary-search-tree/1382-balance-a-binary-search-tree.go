/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func balanceBST(root *TreeNode) *TreeNode {
    arr := make([]*TreeNode, 0)
    
    add := func(node *TreeNode){}
    add = func(node *TreeNode){
        if node == nil { return }

        add(node.Left)
        arr = append(arr, node)
        add(node.Right)
    }

    make := func(l, r int) *TreeNode { return nil }
    make = func(l, r int) *TreeNode {
        if l > r { return nil }

        mid := (l + r) / 2
        parent := arr[mid]
        parent.Left = make(l, mid-1)
        parent.Right = make(mid+1, r)

        return parent
    }

    add(root)

    return make(0, len(arr)-1)
}