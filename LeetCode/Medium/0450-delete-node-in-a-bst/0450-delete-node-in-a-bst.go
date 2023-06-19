/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func deleteNode(root *TreeNode, key int) *TreeNode {
    head := &TreeNode{}
    prev := head
    curr := root
    head.Left = root
    isLeft := true

    for curr != nil && curr.Val != key {
        prev = curr
        if curr.Val > key {
            isLeft = true
            curr = curr.Left
        } else {
            isLeft = false
            curr = curr.Right
        }
    }

    if curr == nil { return root }

    if curr.Right == nil {
        if isLeft {
            prev.Left = curr.Left
        } else {
            prev.Right = curr.Left
        }
    } else {
        temp := curr.Right
        
        for temp.Left != nil { temp = temp.Left }
        temp.Left = curr.Left

        if isLeft {
            prev.Left = curr.Right
        } else {
            prev.Right = curr.Right
        }
    }

    return head.Left
}