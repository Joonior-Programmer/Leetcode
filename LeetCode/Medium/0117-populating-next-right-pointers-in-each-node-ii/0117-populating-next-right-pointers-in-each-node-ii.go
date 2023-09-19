/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Left *Node
 *     Right *Node
 *     Next *Node
 * }
 */

func connect(root *Node) *Node {
    dummy := &Node{}
    temp := dummy
    ret := root
    
    for root != nil {
        if root.Left != nil {
            temp.Next = root.Left
            temp = temp.Next
        }
        
        if root.Right != nil {
            temp.Next = root.Right
            temp = temp.Next
        }
        
        root = root.Next
        
        if root == nil {
            root = dummy.Next
            dummy.Next = nil
            temp = dummy
        }
    }
    
    return ret
}