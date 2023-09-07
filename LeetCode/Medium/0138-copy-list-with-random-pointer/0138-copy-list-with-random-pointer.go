/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Next *Node
 *     Random *Node
 * }
 */

func copyRandomList(head *Node) *Node {
    mapping := make(map[*Node]*Node)
    mapping[nil] = nil
    curr := &Node{Val:-1}
    newHead := curr
    
    for head != nil {
        if _, ok := mapping[head]; ok {
            curr.Next = mapping[head]
        } else {
            temp := &Node{Val: head.Val}
            mapping[head] = temp
            curr.Next = temp
        }
        
        curr = curr.Next
        
        if _, ok := mapping[head.Random]; ok {
            curr.Random = mapping[head.Random]
        } else {
            temp := &Node{Val: head.Random.Val}
            mapping[head.Random] = temp
            curr.Random = temp
        }
        
        head = head.Next
    }
    
    return newHead.Next
}